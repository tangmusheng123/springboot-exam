package com.example.exam.model;

import java.io.Serializable;

public class Answer implements Serializable {
    private Integer answerId;

    private Integer userId;

    private Integer examId;

    private String answerTime;

    /**
     * 总分
     *
     * @mbggenerated
     */
    private Float answerAllgrade;

    /**
     * 正确的
     *
     * @mbggenerated
     */
    private Integer answerY;

    /**
     * 错误的条数
     *
     * @mbggenerated
     */
    private Integer answerN;

    /**
     * 全部多少题
     *
     * @mbggenerated
     */
    private Integer answerAll;

    /**
     * 数据包格式：
     *
     * @mbggenerated
     */
    private String answerResult;

    private static final long serialVersionUID = 1L;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
    }

    public Float getAnswerAllgrade() {
        return answerAllgrade;
    }

    public void setAnswerAllgrade(Float answerAllgrade) {
        this.answerAllgrade = answerAllgrade;
    }

    public Integer getAnswerY() {
        return answerY;
    }

    public void setAnswerY(Integer answerY) {
        this.answerY = answerY;
    }

    public Integer getAnswerN() {
        return answerN;
    }

    public void setAnswerN(Integer answerN) {
        this.answerN = answerN;
    }

    public Integer getAnswerAll() {
        return answerAll;
    }

    public void setAnswerAll(Integer answerAll) {
        this.answerAll = answerAll;
    }

    public String getAnswerResult() {
        return answerResult;
    }

    public void setAnswerResult(String answerResult) {
        this.answerResult = answerResult;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", answerId=").append(answerId);
        sb.append(", userId=").append(userId);
        sb.append(", examId=").append(examId);
        sb.append(", answerTime=").append(answerTime);
        sb.append(", answerAllgrade=").append(answerAllgrade);
        sb.append(", answerY=").append(answerY);
        sb.append(", answerN=").append(answerN);
        sb.append(", answerAll=").append(answerAll);
        sb.append(", answerResult=").append(answerResult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}