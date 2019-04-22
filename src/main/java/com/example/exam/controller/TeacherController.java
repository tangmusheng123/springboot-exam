package com.example.exam.controller;

import com.example.exam.dto.ClassesListDto;
import com.example.exam.dto.QuestionDto;
import com.example.exam.dto.StudentListDto;
import com.example.exam.dto.UserDto;
import com.example.exam.model.Classes;
import com.example.exam.model.Exam;
import com.example.exam.model.Question;
import com.example.exam.model.Questiontype;
import com.example.exam.service.StudentService;
import com.example.exam.service.TeacherService;
import com.example.exam.service.UserService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TeacherController {
	private static final Logger LOGGER = LogManager.getLogger(WebController.class);

//	private UserService userService;
//	private StudentService studentService;

	private TeacherService teacherService;
	@Autowired
	public void setTeacherService(TeacherService teacherService){this.teacherService=teacherService;}


	@PostMapping("/teacher/getstudent")
	@RequiresRoles("teacher")
	public com.example.exam.model.ResponseBean getStudent(@RequestParam("username") String username){

		List<StudentListDto> list=teacherService.getStudentList(username);
		return new com.example.exam.model.ResponseBean(200, "get data success", list);
	}

	@PostMapping("/teacher/getquesttype")
	@RequiresRoles("teacher")
	public com.example.exam.model.ResponseBean getQuestTion(@RequestParam("username") String username){

		List<Questiontype> questionList=teacherService.getQuestType(username);
		return new com.example.exam.model.ResponseBean(200, "get data success", questionList);
	}

	@PostMapping("/teacher/getquestion")
	@RequiresRoles("teacher")
	public com.example.exam.model.ResponseBean getQuestion(@RequestParam("username") String username,@RequestParam("questiontype") String questiontype){
		String data="";
		if(questiontype=="0"){
			data="暂无数据";
			return null;
		}
		List<Question> question = teacherService.getQuestion(username, questiontype);

		return new com.example.exam.model.ResponseBean(200, "get data success", question);
	}
	@PostMapping("/teacher/delquestion")
	@RequiresRoles("teacher")
	public com.example.exam.model.ResponseBean delQuestion(@RequestParam("username") String username,@RequestParam("question_id") String question_id){

	boolean del=teacherService.delQuestion(username,question_id);
		return new com.example.exam.model.ResponseBean(200, "get data success", "删除成功");
	}
	@PostMapping("/teacher/addquestion")
	@RequiresRoles("teacher")
	public com.example.exam.model.ResponseBean addQuestion(@RequestParam("username") String username,
	                                                       @RequestParam("content") String content,
	                                                       @RequestParam("question_a") String question_a,
	                                                       @RequestParam("question_b") String question_b,
	                                                       @RequestParam("question_c") String question_c,
	                                                       @RequestParam("question_d") String question_d,
	                                                       @RequestParam("question_e") String question_e,
	                                                       @RequestParam("question_f") String question_f,
	                                                       @RequestParam("answer") String answer,
	                                                       @RequestParam("type") String type,
	                                                       @RequestParam("questiontype") String questiontype,
                                                           @RequestParam("grade") String grade
	                                                       ){

		boolean add=teacherService.addQuestion(username,content,question_a,
				question_b,question_c,question_d,
				question_e,question_f,answer,type,questiontype,grade);
		return new com.example.exam.model.ResponseBean(200, "get data success", "添加成功");
	}


	@PostMapping("/teacher/getquesttypelist")
	@RequiresRoles("teacher")
	public com.example.exam.model.ResponseBean getQuestTypeList(@RequestParam("username") String username){

		List<Questiontype> questionType = teacherService.getQuestTypeList(username);

		return new com.example.exam.model.ResponseBean(200, "get data success", questionType);
	}

	@PostMapping("/teacher/delquestiontype")
	@RequiresRoles("teacher")
	public com.example.exam.model.ResponseBean delQuestionType(@RequestParam("username") String username,@RequestParam("questiontype") String questiontype){

		boolean del=teacherService.delQuestionType(username,questiontype);
		return new com.example.exam.model.ResponseBean(200, "get data success", "删除成功");
	}

	@PostMapping("/teacher/addquestiontype")
	@RequiresRoles("teacher")
	public com.example.exam.model.ResponseBean addquestiontype(@RequestParam("username") String username,@RequestParam("questiontype") String questiontype){
		boolean del=teacherService.addQuestionType(username,questiontype);
		return new com.example.exam.model.ResponseBean(200, "get data success", "添加成功");
	}
	@PostMapping("/teacher/getclasseslist")
	@RequiresRoles("teacher")
	public com.example.exam.model.ResponseBean getClassesList(@RequestParam("username") String username){
		List<ClassesListDto> listDtoList=new ArrayList<>();
		listDtoList=teacherService.getClassesList(username);
		return new com.example.exam.model.ResponseBean(200, "get data success", listDtoList);
	}

	@PostMapping("/teacher/usequestion")
	@RequiresRoles("teacher")
	public com.example.exam.model.ResponseBean useQuestion(@RequestParam("username") String username,
	                                                       @RequestParam("questionlist") String questionlist,
	                                                       @RequestParam("classesid") String classesid){
		boolean add=teacherService.useQuestion(username,questionlist,classesid);
		return new com.example.exam.model.ResponseBean(200, "get data success", "添加成功");
	}
	@PostMapping("/teacher/getexamtime")
	@RequiresRoles("teacher")
	public com.example.exam.model.ResponseBean getExamTime(@RequestParam("username") String username,@RequestParam("classesid") String classesid){
		List<Exam> examList=new ArrayList<>();
		examList=teacherService.getExamTime(username,classesid);
		return new com.example.exam.model.ResponseBean(200, "get data success", examList);
	}

	@PostMapping("/teacher/getexamquestion")
	@RequiresRoles("teacher")
	public com.example.exam.model.ResponseBean getExamQuestion(@RequestParam("username") String username,@RequestParam("examid") String examid){
		List<QuestionDto> questionDtoList=new ArrayList<>();
		questionDtoList=teacherService.getExamQuestion(username,examid);
		return new com.example.exam.model.ResponseBean(200, "get data success", questionDtoList);
	}
}
