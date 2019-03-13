package com.example.exam.model;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer studentId;

    private String studentName;

    private String studentNumber;

    private String studentPassword;

    private String studentCookie;

    /**
     * 学生加入的班级列表
     *
     * @mbggenerated
     */
    private String classesList;

    private static final long serialVersionUID = 1L;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentCookie() {
        return studentCookie;
    }

    public void setStudentCookie(String studentCookie) {
        this.studentCookie = studentCookie;
    }

    public String getClassesList() {
        return classesList;
    }

    public void setClassesList(String classesList) {
        this.classesList = classesList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentId=").append(studentId);
        sb.append(", studentName=").append(studentName);
        sb.append(", studentNumber=").append(studentNumber);
        sb.append(", studentPassword=").append(studentPassword);
        sb.append(", studentCookie=").append(studentCookie);
        sb.append(", classesList=").append(classesList);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}