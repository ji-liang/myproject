package com.my.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import com.my.dao.UserDao;
import com.my.entity.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



public class LoginAction extends ActionSupport{
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		UserDao ldao=new UserDao();
		if(ldao.login(user).size()>0){
			Map m=ActionContext.getContext().getSession();
			m.put("User", user);
			return "index";
		}else{
			return "error";
		}
		
	}
}
