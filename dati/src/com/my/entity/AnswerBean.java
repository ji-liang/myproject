package com.my.entity;

import java.util.List;

public class AnswerBean {
	private String question;
	private List answers;
	private int correctAnswer;
	
	public AnswerBean() {
		super();
	}
	public AnswerBean(String question, List<Item> answers, int correctAnswer) {
		super();
		this.question = question;
		this.answers = answers;
		this.correctAnswer = correctAnswer;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Item> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Item> answers) {
		this.answers = answers;
	}
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
}
