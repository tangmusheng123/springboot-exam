package com.example.exam.model;

import java.io.Serializable;

public class Classes implements Serializable {
    private Integer classesId;

    private Integer teacherId;

    private String classesName;

    private String classesTime;

    private String studentList;

    private static final long serialVersionUID = 1L;

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }

    public String getClassesTime() {
        return classesTime;
    }

    public void setClassesTime(String classesTime) {
        this.classesTime = classesTime;
    }

    public String getStudentList() {
        return studentList;
    }

    public void setStudentList(String studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classesId=").append(classesId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", classesName=").append(classesName);
        sb.append(", classesTime=").append(classesTime);
        sb.append(", studentList=").append(studentList);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}