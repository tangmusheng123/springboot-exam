package com.example.exam.dto;

public class AdminStudentDto {
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getClassesList() {
		return classesList;
	}

	public void setClassesList(String classesList) {
		this.classesList = classesList;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	private String userName;
	private String classesList;
	private String userNumber;
}
