package com.example.exam.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.exam.dto.*;
import com.example.exam.mapper.*;
import com.example.exam.model.*;
import javafx.scene.shape.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class TeacherService {
	@Autowired
	private ClassesMapper classesMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ExamMapper examMapper;
	@Autowired
	private AnswerMapper answerMapper;
	@Autowired
	private QuestionMapper questionMapper;
	@Autowired
	private QuestiontypeMapper questiontypeMapper;


	/**
	 * 获取教师的学生和课程
	 * @param username
	 * @return
	 */
	public List<StudentListDto> getStudentList(String username) {
		List<StudentListDto> list = new ArrayList();
		User user = userMapper.selectByUserNumber(username);
		ClassesExample classesExample = new ClassesExample();
		ClassesExample.Criteria criteria = classesExample.createCriteria();
		criteria.andTeacherIdEqualTo(user.getUserId());
		List<Classes> classesList = classesMapper.selectByExampleWithBLOBs(classesExample);
		System.out.println(classesList.size()+"长度1");
		for (Classes classes:classesList) {
			String studentString = classes.getStudentList();
			System.out.println(classes.toString()+"学生列表");
			System.out.println(classes.getClassesName());
			String[] studentList=null;
			if(studentString!=""&&studentString!=null){
				studentList = studentString.split(",");
			}

			if(studentList!=null&&studentList.length!=0&&studentString!="") {
				for (int i = 0; i < studentList.length; i++) {
					User userStudent = userMapper.selectByPrimaryKey(Integer.parseInt(studentList[i]));
					System.out.println(userStudent.getUserName() + "xueshengname");
					StudentListDto studentListDto = new StudentListDto();
					studentListDto.setClassesName(classes.getClassesName());
					studentListDto.setStudentName(userStudent.getUserName());
					studentListDto.setUserNumber(userStudent.getUserNumber());
					System.out.println(studentListDto.getClassesName());
					list.add(studentListDto);
				}
			}
		}
		System.out.println(list.size()+"changdu2");
		return list;
	}

	public List<Questiontype> getQuestType(String username){
		User user=userMapper.selectByUserNumber(username);
		QuestiontypeExample questiontypeExample=new QuestiontypeExample();
		QuestiontypeExample.Criteria criteria=questiontypeExample.createCriteria();
		criteria.andTeacherIdEqualTo(user.getUserId());
		List<Questiontype> list = questiontypeMapper.selectByExampleWithBLOBs(questiontypeExample);
		return list;

	}
	public List<Question> getQuestion(String username,String questiontype){
		User user=userMapper.selectByUserNumber(username);
		QuestionExample questionExample=new QuestionExample();
		QuestionExample.Criteria criteria=questionExample.createCriteria();
		criteria.andQuestiontypeIdEqualTo(Integer.parseInt(questiontype));
		List<Question> questionList=questionMapper.selectByExampleWithBLOBs(questionExample);
		for(Question question:questionList){
			question.setQuestionTime(stampToDate(question.getQuestionTime()+"000"));
		}
		return questionList;
	}
	public boolean delQuestion(String username,String question_id){
		int del=questionMapper.deleteByPrimaryKey(Integer.parseInt(question_id));
		boolean delsuccess=true;
		if(del==0){
			delsuccess=false;
		}
		return delsuccess;
	}
	public boolean addQuestion(String username,String content,String question_a,
	                           String question_b,String question_c,String question_d,
	                           String question_e,String question_f,String answer,String type,
	                           String questiontype,String grade){
		User user=userMapper.selectByUserNumber(username);
		Question question=new Question();
		question.setQuestionTime(String.valueOf(new Date().getTime() / 1000));
		question.setQuestionType(type);
		question.setQuestiontypeId(Integer.parseInt(questiontype));
		question.setQuestionContent(content);
		question.setQuestionAnswer(answer);
		question.setQuestionA(question_a);
		question.setQuestionB(question_b);
		question.setQuestionC(question_c);
		question.setQuestionD(question_d);
		question.setQuestionE(question_e);
		question.setQuestionF(question_f);
		question.setQuestionG(grade);
		questionMapper.insert(question);
		return true;
	}

	public List<Questiontype> getQuestTypeList(String username){
		User user=userMapper.selectByUserNumber(username);
		QuestiontypeExample questiontypeExample=new QuestiontypeExample();
		QuestiontypeExample.Criteria criteria=questiontypeExample.createCriteria();
		criteria.andTeacherIdEqualTo(user.getUserId());
		List<Questiontype> questiontypeList=questiontypeMapper.selectByExampleWithBLOBs(questiontypeExample);
		for(Questiontype questiontype:questiontypeList){
			questiontype.setQuestiontypeTime(stampToDate(questiontype.getQuestiontypeTime()+"000"));
		}
		return questiontypeList;
	}


	public boolean delQuestionType(String username,String questiontype){
		int del=questiontypeMapper.deleteByPrimaryKey(Integer.parseInt(questiontype));
		boolean delsuccess=true;
		if(del==0){
			delsuccess=false;
		}
		return delsuccess;
	}
	public boolean addQuestionType(String username,String questiontype){
		User user=userMapper.selectByUserNumber(username);
		Questiontype questiontype1=new Questiontype();
		questiontype1.setQuestiontypeName(questiontype);
		questiontype1.setQuestiontypeTime(String.valueOf(new Date().getTime() / 1000));
		questiontype1.setTeacherId(user.getUserId());
		int add=questiontypeMapper.insert(questiontype1);
		boolean addsuccess=true;
		if(add==0){
			addsuccess=false;
		}
		return addsuccess;
	}
	public List<ClassesListDto> getClassesList(String username){
		List<ClassesListDto> listDtoList=new ArrayList<>();
		User user=userMapper.selectByUserNumber(username);
		ClassesExample classesExample=new ClassesExample();
		ClassesExample.Criteria criteria=classesExample.createCriteria();
		criteria.andTeacherIdEqualTo(user.getUserId());
		List<Classes> classesList=classesMapper.selectByExampleWithBLOBs(classesExample);
		for(Classes classes:classesList){
			ClassesListDto classesListDto=new ClassesListDto();
			if(classes.getStudentList()!=null&&classes.getStudentList()!="") {
				String[] number = classes.getStudentList().split(",");
				classesListDto.setStudentNumber(Integer.toString(number.length));
				classesListDto.setClassesId(Integer.toString(classes.getClassesId()));
				classesListDto.setClassesName(classes.getClassesName());
				listDtoList.add(classesListDto);
			}
		}
		return listDtoList;
	}

	public boolean useQuestion(String username,String questionlist,String classesid){
		User user=userMapper.selectByUserNumber(username);
		Exam exam=new Exam();
		exam.setClassesId(Integer.parseInt(classesid));
		exam.setQuestionList(questionlist);
		exam.setTeacherId(user.getUserId());
		examMapper.insert(exam);
		return true;
	}
	public List<Exam> getExamTime(String username,String classesid){
		List<Exam> examList=new ArrayList<>();
		ExamExample examExample=new ExamExample();
		ExamExample.Criteria criteria=examExample.createCriteria();
		criteria.andClassesIdEqualTo(Integer.parseInt(classesid));
		examList=examMapper.selectByExampleWithBLOBs(examExample);
		return examList;
	}
	public List<QuestionDto> getExamQuestion(String username,String examid){
		List<QuestionDto> questionDtoList=new ArrayList<>();
		Exam exam=examMapper.selectByPrimaryKey(Integer.parseInt(examid));
		String[] questionString=exam.getQuestionList().split(",");
		for(int i=0;i<questionString.length;i++){
			QuestionDto questionDto=new QuestionDto();
			Question question=questionMapper.selectByPrimaryKey(Integer.parseInt(questionString[i]));
			questionDto.setQuestion_content(question.getQuestionContent());
			questionDto.setQuestion_type(question.getQuestionType());
			questionDto.setQuestion_id(question.getQuestionId());
			questionDtoList.add(questionDto);
		}
		return questionDtoList;
	}
	/*
	 * 将时间戳转换为时间
	 */
	public static String stampToDate(String s){
		String res;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long lt = new Long(s);
		Date date = new Date(lt);
		res = simpleDateFormat.format(date);
		return res;
	}
	private List<Classes> getStudentClasses(String username){
		List<Classes> list=new ArrayList<Classes>();
		User user= userMapper.selectByUserNumber(username);
		String classesList=user.getClassesList();//获取列表然后拆分
		if(classesList!="") {
			String[] sourceStrArray = classesList.split(",");
			for (int i = 0; i < sourceStrArray.length; i++) {
//				System.out.println(sourceStrArray[i]);
				list.add(classesMapper.selectByPrimaryKey(Integer.parseInt(sourceStrArray[i])));
			}
		}
		return list;
	}
}
