package com.my.dao;

import java.util.ArrayList;
import java.util.List;

import com.dao.BaseDao;
import com.my.entity.User;

public class UserDao extends BaseDao {
	public List<User>login(User user){
		String sql="select *from user_info where user_name=? and user_password=?";
		List params=new ArrayList();
		params.add(user.getUser_name());
		params.add(user.getUser_password());
		super.setParams(params);
		return super.query(sql, User.class);
		
	}
}
