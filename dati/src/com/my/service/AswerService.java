package com.my.service;



import java.util.List;

import com.my.dao.AnswerDao;
import com.my.dao.ItemDao;
import com.my.entity.Answer;


public class AswerService {
	private AnswerDao adao=new AnswerDao();
	private ItemDao idao=new ItemDao();
	public int addAnswer(String title,List items,int select){
		int flag=0;
		if(adao.addAnswer(title)>0){
			List<Answer>list=adao.getId(title);
			int answer_id=list.get(0).getId();
			flag=idao.addAnswer(answer_id, items, select);
		}
		return flag;
	}
	public List<Answer>getAll(int page,int size){
		return adao.getAnswer(page, size);
	}
	public int delItem(int id){
		if(idao.delItem(id)>=0){
			return adao.delAnswer(id);
		}else{
			return -1;
		}
		
	}
}
