package com.my.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.my.dao.AnswerDao;
import com.my.dao.ItemDao;
import com.my.entity.Answer;
import com.my.entity.AnswerBean;
import com.my.entity.Item;
import com.my.entity.QuestionBean;
import com.my.service.AswerService;
import com.my.service.QuestionsService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAction extends ActionSupport {
	private QuestionsService qs=new QuestionsService();

	public String show() throws Exception {
		// TODO Auto-generated method stub
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Gson g = new Gson();
		QuestionBean ab=new QuestionBean(qs.getAllQuestion());
		out.print(g.toJson(ab));
		return null;
	}
}
