package com.example.exam.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.exam.dto.*;
import com.example.exam.mapper.*;
import com.example.exam.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class StudentService {
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

	public List<Classes> getClassesList(String username){
		List<Classes> list = getStudentClasses(username);
		return list;
	}
	public List getExam(String username){
		List<Classes> list = getStudentClasses(username);
		User user= userMapper.selectByUserNumber(username);
//		Iterator iterator = list.iterator();
//		while(iterator.hasNext()){
//			Object object=iterator.hasNext();
//			object.
//		}
		List studentExamDtoList=new ArrayList();
		for(Classes classes:list){
//			System.out.println(classes.getClassesId());
			ExamExample examExample=new ExamExample();
			ExamExample.Criteria criteriaExam=examExample.createCriteria();
			criteriaExam.andClassesIdEqualTo(classes.getClassesId());
			List<Exam> list1 = examMapper.selectByExampleWithBLOBs(examExample);
			System.out.println(list1.size()+"list的长度");
			for(Exam exam:list1){
				AnswerExample answerExample=new AnswerExample();
				AnswerExample.Criteria criteriaAnswer=answerExample.createCriteria();
				criteriaAnswer.andUserIdEqualTo(user.getUserId()).andExamIdEqualTo(exam.getExamId());
				List answer=answerMapper.selectByExampleWithBLOBs(answerExample);
				System.out.println(answer.toString()+" panduan");
				StudentExamDto studentExamDto=new StudentExamDto();
				if(!answer.isEmpty()&&answer.size() != 0){
					//有元素，该张试卷考生已做
					studentExamDto.setExamStatus("02");
				}else{
					studentExamDto.setExamStatus("01");
				}
				//提出老师名字

				studentExamDto.setExamId(exam.getExamId());
				studentExamDto.setClassesName(classes.getClassesName());
				studentExamDto.setTeacherName(userMapper.selectByPrimaryKey(exam.getTeacherId()).getUserName());
				studentExamDtoList.add(studentExamDto);
			}
		}
		return studentExamDtoList;
	}
	public Map<String, List> getTest(String username, String examid){
		//要判断该学生是否属于该试题的班级
//		List<Classes> list = getStudentClasses(username);
//		User user= userMapper.selectByUserNumber(username);
		Exam exam=examMapper.selectByPrimaryKey(Integer.parseInt(examid));
		String examList=exam.getQuestionList();
		List<QuestionDto> listQuestion01=new ArrayList<>();
		List<QuestionDto> listQuestion02=new ArrayList<>();
		Integer num01=1;
		Integer num02=1;
		if(examList!=""){
			String[] sourceStrArray=examList.split(",");
			for(int i=0;i<sourceStrArray.length;i++){
				Question question=questionMapper.selectByPrimaryKey(Integer.parseInt(sourceStrArray[i]));
				QuestionDto questionDto=new QuestionDto();
				questionDto.setQuestion_id(question.getQuestionId());
				questionDto.setQuestion_type(question.getQuestionType());
				questionDto.setQuestiontype_id(question.getQuestiontypeId());
				questionDto.setQuestion_content(question.getQuestionContent());
				questionDto.setQuestion_grade(question.getQuestionG());
				questionDto.setQuestion_a(question.getQuestionA());
				questionDto.setQuestion_b(question.getQuestionB());
				questionDto.setQuestion_c(question.getQuestionC());
				questionDto.setQuestion_d(question.getQuestionD());
				questionDto.setQuestion_e(question.getQuestionE());
				questionDto.setQuestion_f(question.getQuestionF());

				if(question.getQuestionType().equals("01")){
					listQuestion01.add(questionDto);
					questionDto.setNumber(num01);
					num01++;
				}else{
					listQuestion02.add(questionDto);
					questionDto.setNumber(num02);
					num02++;
				}
			}
		}
		Map<String,List> map = new HashMap<>();
		map.put("listQuestion01", listQuestion01);
		map.put("listQuestion02", listQuestion02);
		return map;
	}

	/**
	 * 处理答卷
	 * @param username
	 * @return
	 */
	public boolean detailAnswer(String username,
	                            String mapsign,
	                            String mapmost,
	                            String signquestionlist,
	                            String mostquestionlist,
	                            String examid,
	                            String mostnumber,
	                            String signnumber){
		Map<String,String> answerMapSign=new HashMap();
		Map<String,String> answerMapMost=new HashMap();
		float allgrade=0;
		int all=0;//多了题
		int answer_y=0;
		int answer_n=0;
		User user= userMapper.selectByUserNumber(username);
//		单选开始
		JSONObject jsonObject=JSON.parseObject(mapsign);
		String[] sourceStrArray=signquestionlist.split(",");
		for(int i=0;i<sourceStrArray.length;i++){
//			得到答案
			String signAnswer=(String)jsonObject.get(Integer.toString(i+1));
			Question question=questionMapper.selectByPrimaryKey(Integer.parseInt(sourceStrArray[i]));
			if(signAnswer.equals(question.getQuestionAnswer())){
//				回答正确
				allgrade+=Float.parseFloat(question.getQuestionG());
				answer_y++;
			}else{
				answer_n++;
			}
			all++;
//			answerMapSign.put(Integer.toString(question.getQuestionId()),signAnswer);
		}
		//多选题
		JSONObject jsonObject1=JSON.parseObject(mapmost);
		String[] sourceStrArray1=mostquestionlist.split(",");
		for(int i=0;i<sourceStrArray1.length;i++){
			//得到答案
			String mostAnswer=(String)jsonObject1.get(Integer.toString(i+1));
			Question question=questionMapper.selectByPrimaryKey(Integer.parseInt(sourceStrArray1[i]));
			if(mostAnswer.equals(question.getQuestionAnswer())){
//				回答正确
				allgrade+=Float.parseFloat(question.getQuestionG());
				answer_y++;
			}else{
				answer_n++;
			}
			all++;
//			answerMapMost.put(Integer.toString(question.getQuestionId()),mostAnswer);
		}
//		System.out.println(jsonObject.get("1")+"map");
//		System.out.println("----------print data");
//		System.out.println(answerMapMost);
//		System.out.println(answerMapSign);
//		System.out.println(allgrade);
//		System.out.println(answer_y);
//		System.out.println(answer_n);
		Answer answer=new Answer();
		answer.setAnswerAll(all);
		answer.setAnswerAllgrade(allgrade);
		answer.setAnswerTime(String.valueOf(new Date().getTime() / 1000));
		answer.setAnswerY(answer_y);
		answer.setAnswerN(answer_n);
		answer.setUserId(user.getUserId());
		answer.setExamId(Integer.parseInt(examid));
		answerMapper.insert(answer);
		return true;
	}


	/**
	 * 获得历史成绩
	 * @param username
	 * @return
	 */
	public Map getHistory(String username){
		Map<String,List> map = new HashMap<>();
		User user=userMapper.selectByUserNumber(username);
		AnswerExample answerExample=new AnswerExample();
		AnswerExample.Criteria criteriaAnswer=answerExample.createCriteria();
		criteriaAnswer.andUserIdEqualTo(user.getUserId());
		List<Answer> answerList=answerMapper.selectByExample(answerExample);
		List<HistoryDto> historyDtos=new ArrayList<>();
		for(Answer answer:answerList){
			Exam exam=examMapper.selectByPrimaryKey(answer.getExamId());
			Classes classes=classesMapper.selectByPrimaryKey(exam.getClassesId());
			HistoryDto historyDto=new HistoryDto();
			historyDto.setClassesName(classes.getClassesName());
			historyDto.setGrade(Float.toString(answer.getAnswerAllgrade()));
			historyDto.setStatus("已考试");
			historyDto.setTime(stampToDate(answer.getAnswerTime()+"000"));
			historyDtos.add(historyDto);
		}
		map.put("data", historyDtos);
		System.out.println(historyDtos+"my data");
		return map;
	}
	public UserDto getUserInfo(String username){
		User user=userMapper.selectByUserNumber(username);
		UserDto userDto=new UserDto();
		userDto.setClassesNum(Integer.toString(user.getClassesList().split(",").length));
		userDto.setTime(stampToDate(user.getUserCookie()+"000"));
		userDto.setUserName(user.getUserName());
		userDto.setUserNumber(user.getUserNumber());
		return userDto;
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
