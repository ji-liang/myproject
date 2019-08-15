package com.my.entity;

import java.util.List;

public class ItemBean {
	private String question;
	private int correctAnswer;
	private int id;
	private int page;
	
	public ItemBean() {
		super();
	}
	public ItemBean(int page) {
		super();
		this.page = page;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getTitle() {
		return question;
	}
	public void setTitle(String title) {
		this.question = title;
	}
	public int getSelect() {
		return correctAnswer;
	}
	public void setSelect(int select) {
		this.correctAnswer = select;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	
}
