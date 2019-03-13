package com.example.exam.model;

import java.io.Serializable;

public class Teacher implements Serializable {
    private Integer teacherId;

    private String teacherName;

    private String teacherPassword;

    private String teacherNumber;

    private String teacherCookie;

    private static final long serialVersionUID = 1L;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword;
    }

    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public String getTeacherCookie() {
        return teacherCookie;
    }

    public void setTeacherCookie(String teacherCookie) {
        this.teacherCookie = teacherCookie;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teacherId=").append(teacherId);
        sb.append(", teacherName=").append(teacherName);
        sb.append(", teacherPassword=").append(teacherPassword);
        sb.append(", teacherNumber=").append(teacherNumber);
        sb.append(", teacherCookie=").append(teacherCookie);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}