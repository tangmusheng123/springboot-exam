package com.example.exam.controller;

import com.example.exam.dto.*;
import com.example.exam.model.Classes;
import com.example.exam.model.Exam;
import com.example.exam.model.Question;
import com.example.exam.model.Questiontype;
import com.example.exam.service.AdminService;
import com.example.exam.service.TeacherService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AdminController {
	private static final Logger LOGGER = LogManager.getLogger(WebController.class);

	private AdminService adminService;
	@Autowired
	public void setTeacherService(AdminService adminService){this.adminService=adminService;}


	@PostMapping("/admin/getstudent")
	@RequiresRoles("admin")
	public com.example.exam.model.ResponseBean getStudent(@RequestParam("username") String username){

		List<AdminStudentDto> list=adminService.getStudentList(username);
		return new com.example.exam.model.ResponseBean(200, "get data success", list);
	}

	@PostMapping("/admin/getclasses")
	@RequiresRoles("admin")
	public com.example.exam.model.ResponseBean getClasses(@RequestParam("username") String username){

		List<Classes> list=adminService.getClasses(username);
		return new com.example.exam.model.ResponseBean(200, "get data success", list);
	}
	@PostMapping("/admin/addstudent")
	@RequiresRoles("admin")
	public com.example.exam.model.ResponseBean addStudent(@RequestParam("username") String username,
	                                                      @RequestParam("username1") String username1,
	                                                      @RequestParam("usernumber") String usernumber,
	                                                      @RequestParam("userpassword") String userpassword,
	                                                      @RequestParam("classeslist") String classeslist){

		boolean add=adminService.addStudent(username, username1, usernumber, userpassword, classeslist);
		return new com.example.exam.model.ResponseBean(200, "get data success", null);
	}

	@PostMapping("/admin/getteacher")
	@RequiresRoles("admin")
	public com.example.exam.model.ResponseBean getTeacher(@RequestParam("username") String username){

		List<AdminStudentDto> list=adminService.getTeacher(username);
		return new com.example.exam.model.ResponseBean(200, "get data success", list);
	}

	@PostMapping("/admin/addteacher")
	@RequiresRoles("admin")
	public com.example.exam.model.ResponseBean addTeacher(@RequestParam("username") String username,
														  @RequestParam("username1") String username1,
														  @RequestParam("usernumber") String usernumber,
														  @RequestParam("userpassword") String userpassword){

		boolean add=adminService.addTeacher(username, username1, usernumber, userpassword);
		return new com.example.exam.model.ResponseBean(200, "get data success", null);
	}
	@PostMapping("/admin/getclasseslist")
	@RequiresRoles("admin")
	public com.example.exam.model.ResponseBean addclassesgetClassesList(@RequestParam("username") String username){

		List<AdminClassesDto> list=adminService.getClassesList(username);
		return new com.example.exam.model.ResponseBean(200, "get data success", list);
	}
	@PostMapping("/admin/addclasses")
	@RequiresRoles("admin")
	public com.example.exam.model.ResponseBean addClasses(@RequestParam("classesname") String classesname,
														  @RequestParam("teacherlist") String teacherlist){

		boolean add=adminService.addClasses(classesname, teacherlist);
		return new com.example.exam.model.ResponseBean(200, "get data success", null);
	}
}
