package com.example.exam.model;

import java.io.Serializable;

public class Question implements Serializable {
    private Integer questionId;

    private Integer questiontypeId;

    /**
     * 题目的类型，01是单选，02为多选
     *
     * @mbggenerated
     */
    private String questionType;

    /**
     * 答案的字符串
     *
     * @mbggenerated
     */
    private String questionAnswer;

    /**
     * 题目创建的时间
     *
     * @mbggenerated
     */
    private String questionTime;

    /**
     * 题目的标题
     *
     * @mbggenerated
     */
    private String questionContent;

    private String questionA;

    private String questionB;

    private String questionC;

    private String questionD;

    private String questionE;

    private String questionF;

    private String questionG;

    private static final long serialVersionUID = 1L;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getQuestiontypeId() {
        return questiontypeId;
    }

    public void setQuestiontypeId(Integer questiontypeId) {
        this.questiontypeId = questiontypeId;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionTime() {
        return questionTime;
    }

    public void setQuestionTime(String questionTime) {
        this.questionTime = questionTime;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getQuestionA() {
        return questionA;
    }

    public void setQuestionA(String questionA) {
        this.questionA = questionA;
    }

    public String getQuestionB() {
        return questionB;
    }

    public void setQuestionB(String questionB) {
        this.questionB = questionB;
    }

    public String getQuestionC() {
        return questionC;
    }

    public void setQuestionC(String questionC) {
        this.questionC = questionC;
    }

    public String getQuestionD() {
        return questionD;
    }

    public void setQuestionD(String questionD) {
        this.questionD = questionD;
    }

    public String getQuestionE() {
        return questionE;
    }

    public void setQuestionE(String questionE) {
        this.questionE = questionE;
    }

    public String getQuestionF() {
        return questionF;
    }

    public void setQuestionF(String questionF) {
        this.questionF = questionF;
    }

    public String getQuestionG() {
        return questionG;
    }

    public void setQuestionG(String questionG) {
        this.questionG = questionG;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questionId=").append(questionId);
        sb.append(", questiontypeId=").append(questiontypeId);
        sb.append(", questionType=").append(questionType);
        sb.append(", questionAnswer=").append(questionAnswer);
        sb.append(", questionTime=").append(questionTime);
        sb.append(", questionContent=").append(questionContent);
        sb.append(", questionA=").append(questionA);
        sb.append(", questionB=").append(questionB);
        sb.append(", questionC=").append(questionC);
        sb.append(", questionD=").append(questionD);
        sb.append(", questionE=").append(questionE);
        sb.append(", questionF=").append(questionF);
        sb.append(", questionG=").append(questionG);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}