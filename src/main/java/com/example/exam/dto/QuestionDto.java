package com.example.exam.dto;

import com.example.exam.model.Question;

public class QuestionDto {
	private Integer question_id;

	public Integer getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Integer question_id) {
		this.question_id = question_id;
	}

	public Integer getQuestiontype_id() {
		return questiontype_id;
	}

	public void setQuestiontype_id(Integer questiontype_id) {
		this.questiontype_id = questiontype_id;
	}

	public String getQuestion_type() {
		return question_type;
	}

	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}

	public String getQuestion_content() {
		return question_content;
	}

	public void setQuestion_content(String question_content) {
		this.question_content = question_content;
	}

	public String getQuestion_a() {
		return question_a;
	}

	public void setQuestion_a(String question_a) {
		this.question_a = question_a;
	}

	public String getQuestion_b() {
		return question_b;
	}

	public void setQuestion_b(String question_b) {
		this.question_b = question_b;
	}

	public String getQuestion_c() {
		return question_c;
	}

	public void setQuestion_c(String question_c) {
		this.question_c = question_c;
	}

	public String getQuestion_d() {
		return question_d;
	}

	public void setQuestion_d(String question_d) {
		this.question_d = question_d;
	}

	public String getQuestion_e() {
		return question_e;
	}

	public void setQuestion_e(String question_e) {
		this.question_e = question_e;
	}

	public String getQuestion_f() {
		return question_f;
	}

	public void setQuestion_f(String question_f) {
		this.question_f = question_f;
	}

	public String getQuestion_grade() {
		return question_grade;
	}

	public void setQuestion_grade(String question_grade) {
		this.question_grade = question_grade;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	private Integer questiontype_id;
	private String question_type;
	private String question_content;
	private String question_a;
	private String question_b;
	private String question_c;
	private String question_d;
	private String question_e;
	private String question_f;
//	将question_g当做该题目的分数
	private String question_grade;
	private Integer number;

}
