package com.my.dao;


import java.util.ArrayList;
import java.util.List;

import com.dao.BaseDao;
import com.my.entity.Answer;


public class AnswerDao extends BaseDao {
	public int addAnswer(String title){
		String sql="INSERT INTO answer_info VALUES (0,?)";
		List params=new ArrayList();
		params.add(title);
		super.setParams(params);	
		return super.update(sql);
	}
	public List getId(String title){
		super.setParams(new ArrayList());	
		String sql="select *from answer_info where question='"+title+"'";
		return super.query(sql, Answer.class);
	}
	public List<Answer>getAnswer(int page,int size){
		super.setParams(new ArrayList());	
		String sql="select * from answer_info limit "+size*(page-1)+","+size;
		return super.query(sql, Answer.class);
	}
	public int delAnswer(int id){
		String sql="DELETE FROM answer_info WHERE id="+id;
		return super.update(sql);
	}
	public List<Answer>getAll(){
		super.setParams(new ArrayList());	
		String sql="select *from answer_info ";
		return super.query(sql, Answer.class);
	}
}
