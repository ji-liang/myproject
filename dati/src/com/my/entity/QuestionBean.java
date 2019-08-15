package com.my.entity;

import java.util.List;


public class QuestionBean {
	private  List  questions;

	public QuestionBean() {
		super();
	}

	public QuestionBean(List<AnswerBean> questions) {
		super();
		this.questions = questions;
	}

	public List getQuestions() {
		return questions;
	}

	public void setQuestions(List questions) {
		this.questions = questions;
	}

}
