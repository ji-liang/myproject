package com.my.action;

import org.omg.CORBA.Request;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	//µÇÂ½À¹½Ø
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		if (arg0.getInvocationContext().getSession().get("User") == null) {	
			return "error";
		}else{
			return arg0.invoke();	
		}
	}

}
