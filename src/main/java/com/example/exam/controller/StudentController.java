package com.example.exam.controller;

import com.example.exam.dto.UserDto;
import com.example.exam.model.Classes;
import com.example.exam.service.StudentService;
import com.example.exam.service.UserService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
	private static final Logger LOGGER = LogManager.getLogger(WebController.class);

	private UserService userService;
	private StudentService studentService;

	@Autowired
	public void setStudentService(StudentService studentService){
		this.studentService=studentService;
	}

	@Autowired
	public void setService(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/student/getclasses")
	@RequiresRoles("student")
	public com.example.exam.model.ResponseBean getclasses(@RequestParam("username") String username){
		List<Classes> classesList=new ArrayList();
		classesList=studentService.getClassesList(username);
//		return classesList;
		Map<String, List> data = new HashMap<>();
		data.put("list", classesList);
		return new com.example.exam.model.ResponseBean(200, "get data success", data);
	}

	@PostMapping("/student/getexam")
	@RequiresRoles("student")
	public com.example.exam.model.ResponseBean getExam(@RequestParam("username") String username){
		List list=new ArrayList();
		list=studentService.getExam(username);
		Map<String, List> data = new HashMap<>();
		data.put("list",list);
		return new com.example.exam.model.ResponseBean(200, "get data success", data);
	}

	@PostMapping("/student/gettest")
	@RequiresRoles("student")
	public com.example.exam.model.ResponseBean getTest(@RequestParam("username") String username,@RequestParam("examid") String examid){
		Map<String, List> data = new HashMap<>();
		data=studentService.getTest(username,examid);
		return new com.example.exam.model.ResponseBean(200, "get data success", data);
	}
//	核心答卷业务

	/**
	 * 1、录入成绩
	 * 2、原始答题的json合并包
	 * 3、考生总得分
	 * 4、正确题数
	 * 5、错误题数
	 * 6、总题
	 * @param username
	 * @param mapsign
	 * @param mapmost
	 * @param signquestionlist
	 * @param mostquestionlist
	 * @param examid
	 * @return
	 */
	@PostMapping("/student/answerdata")
	@RequiresRoles("student")
	public com.example.exam.model.ResponseBean answerData(@RequestParam("username") String username,
	                                                      @RequestParam("mapsign") String mapsign,
	                                                      @RequestParam("mapmost") String mapmost,
	                                                      @RequestParam("signquestionlist") String signquestionlist,
	                                                      @RequestParam("mostquestionlist") String mostquestionlist,
	                                                      @RequestParam("examid") String examid,
	                                                      @RequestParam("mostnumber") String mostnumber,
	                                                      @RequestParam("signnumber") String signnumber){
		boolean result=studentService.detailAnswer(username,mapsign,mapmost,signquestionlist,mostquestionlist,examid,mostnumber,signnumber);
		return new com.example.exam.model.ResponseBean(200, "answer data success", null);
	}

	@PostMapping("/student/gethistory")
	@RequiresRoles("student")
	public com.example.exam.model.ResponseBean getHistory(@RequestParam("username") String username){

		Map<String, List> data = new HashMap<>();
		data=studentService.getHistory(username);
		return new com.example.exam.model.ResponseBean(200, "answer data success", data);
	}
	@PostMapping("/student/getuserinfo")
	@RequiresRoles("student")
	public com.example.exam.model.ResponseBean getUserInfo(@RequestParam("username") String username){

		UserDto userDto=studentService.getUserInfo(username);
		return new com.example.exam.model.ResponseBean(200, "answer data success", userDto);
	}
}
