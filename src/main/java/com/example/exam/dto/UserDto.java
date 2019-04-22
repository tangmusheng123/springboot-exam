package com.example.exam.dto;

public class UserDto {
	private String userNumber;

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getClassesNum() {
		return classesNum;
	}

	public void setClassesNum(String classesNum) {
		this.classesNum = classesNum;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	private String userName;
	private String classesNum;
	private String time;

}
