package com.example.exam.model;

import java.io.Serializable;

public class Questiontype implements Serializable {
    private Integer questiontypeId;

    private Integer teacherId;

    private String questiontypeTime;

    private String questiontypeName;

    private static final long serialVersionUID = 1L;

    public Integer getQuestiontypeId() {
        return questiontypeId;
    }

    public void setQuestiontypeId(Integer questiontypeId) {
        this.questiontypeId = questiontypeId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getQuestiontypeTime() {
        return questiontypeTime;
    }

    public void setQuestiontypeTime(String questiontypeTime) {
        this.questiontypeTime = questiontypeTime;
    }

    public String getQuestiontypeName() {
        return questiontypeName;
    }

    public void setQuestiontypeName(String questiontypeName) {
        this.questiontypeName = questiontypeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questiontypeId=").append(questiontypeId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", questiontypeTime=").append(questiontypeTime);
        sb.append(", questiontypeName=").append(questiontypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}