package com.example.exam.service;

import com.example.exam.dto.*;
import com.example.exam.mapper.*;
import com.example.exam.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AdminService {
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
	 * 获取学生和课程
	 * @param username
	 * @return
	 */
	public List<AdminStudentDto> getStudentList(String username) {
		List<AdminStudentDto> list = new ArrayList();
		UserExample userExample=new UserExample();
		UserExample.Criteria criteria=userExample.createCriteria();
		criteria.andUserRoleEqualTo("student");
		List<User> userList=userMapper.selectByExampleWithBLOBs(userExample);
		for(User user:userList){
			String[] classesList=user.getClassesList().split(",");
			String classesName="";
			for(int i=0;i<classesList.length;i++){
				Classes classes=classesMapper.selectByPrimaryKey(Integer.parseInt(classesList[i]));
				classesName+=classes.getClassesName()+",";
			}
			AdminStudentDto adminStudentDto=new AdminStudentDto();
			adminStudentDto.setClassesList(classesName);
			adminStudentDto.setUserId(Integer.toString(user.getUserId()));
			adminStudentDto.setUserNumber(user.getUserNumber());
			adminStudentDto.setUserName(user.getUserName());
			list.add(adminStudentDto);
		}
		return list;
	}
	public List<Classes> getClasses(String username){
		ClassesExample classesExample=new ClassesExample();
		ClassesExample.Criteria criteria=classesExample.createCriteria();
		criteria.andTeacherIdIsNotNull();
		List<Classes> classesList=classesMapper.selectByExampleWithBLOBs(classesExample);
		return classesList;
	}
	public boolean addStudent(String username,String username1,String usernumber,String userpassword,String classeslist){
		User user=new User();
		user.setClassesList(classeslist);
		user.setUserCookie(String.valueOf(new Date().getTime() / 1000));
		user.setUserName(username1);
		user.setUserNumber(usernumber);
		user.setUserPassword(userpassword);
		user.setUserPermission("student");
		user.setUserRole("student");
		int id=userMapper.insert(user);
		System.out.println("插入学生的id====="+user.getUserId());
		String[] classesListString=classeslist.split(",");
		System.out.println("课程的数量为"+classesListString.length);
		for(int i=0;i<classesListString.length;i++){
			Classes classes=classesMapper.selectByPrimaryKey(Integer.parseInt(classesListString[i]));
			if(classes.getStudentList()==null){
				classes.setStudentList("");
			}
			classes.setStudentList(classes.getStudentList()+user.getUserId()+",");
			System.out.println("查询的班级为"+classes.getClassesName());
			System.out.println("班级的id为："+classesListString[i]);
			System.out.println("插入的学生id列表为:"+classes.getStudentList());
			System.out.println(classes.toString()+"更新的数据");
//			classesMapper.updateByPrimaryKey(classes);
			classesMapper.updateByPrimaryKeyWithBLOBs(classes);
		}
		return true;
	}
	public boolean addTeacher(String username,String username1,String usernumber,String userpassword){
		User user=new User();
		user.setUserCookie(String.valueOf(new Date().getTime() / 1000));
		user.setUserName(username1);
		user.setUserNumber(usernumber);
		user.setUserPassword(userpassword);
		user.setUserPermission("teacher");
		user.setUserRole("teacher");
		userMapper.insert(user);
		return true;
	}
	public List<AdminStudentDto> getTeacher(String username){
		List<AdminStudentDto> list = new ArrayList();
		UserExample userExample=new UserExample();
		UserExample.Criteria criteria=userExample.createCriteria();
		criteria.andUserRoleEqualTo("teacher");
		List<User> userList=userMapper.selectByExampleWithBLOBs(userExample);
		for(User user:userList){
			AdminStudentDto adminStudentDto=new AdminStudentDto();
			ClassesExample classesExample=new ClassesExample();
			ClassesExample.Criteria criteria1=classesExample.createCriteria();
			criteria1.andTeacherIdEqualTo(user.getUserId());
			List<Classes> classesList=classesMapper.selectByExampleWithBLOBs(classesExample);
			String classesString="";
			for(Classes classes:classesList){
				classesString+=classes.getClassesName()+",";
			}
			adminStudentDto.setClassesList(classesString);
			adminStudentDto.setUserId(Integer.toString(user.getUserId()));
			adminStudentDto.setUserNumber(user.getUserNumber());
			adminStudentDto.setUserName(user.getUserName());
			list.add(adminStudentDto);
		}
		return list;
	}
	public List<AdminClassesDto> getClassesList(String username){
		List<AdminClassesDto> adminClassesDtoList=new ArrayList<>();
		ClassesExample classesExample=new ClassesExample();
		ClassesExample.Criteria criteria=classesExample.createCriteria();
		criteria.andTeacherIdIsNotNull();
		List<Classes> classesList=classesMapper.selectByExampleWithBLOBs(classesExample);
		for(Classes classes:classesList){
			AdminClassesDto adminClassesDto=new AdminClassesDto();
			User user=userMapper.selectByPrimaryKey(classes.getTeacherId());
			adminClassesDto.setClassesId(Integer.toString(classes.getClassesId()));
			adminClassesDto.setClassesName(classes.getClassesName());
			adminClassesDto.setTeacherName(user.getUserName());
			if(classes.getStudentList()!=""&&classes.getStudentList()!=null) {
				String[] student = classes.getStudentList().split(",");
				adminClassesDto.setStudentNumber(Integer.toString(student.length));
			}else{
				adminClassesDto.setStudentNumber("0");
			}
			adminClassesDtoList.add(adminClassesDto);
		}
		return adminClassesDtoList;
	}
	public boolean addClasses(String classesname,String  teacherlist){
		Classes classes=new Classes();
		classes.setClassesName(classesname);
		classes.setClassesTime(String.valueOf(new Date().getTime() / 1000));
//		classes.setStudentList(studentlist);
		classes.setTeacherId(Integer.parseInt(teacherlist));
		classesMapper.insert(classes);
		return true;
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
