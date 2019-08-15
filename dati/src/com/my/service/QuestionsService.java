package com.my.service;

import java.util.ArrayList;
import java.util.List;

import com.my.dao.AnswerDao;
import com.my.dao.ItemDao;
import com.my.entity.Answer;
import com.my.entity.AnswerBean;
import com.my.entity.Item;

public class QuestionsService {
	public List getAllQuestion(){
		AnswerDao sdao = new AnswerDao();
		ItemDao idao = new ItemDao();
		List<Answer> list = sdao.getAll();
		List<Item> list1 = null;
		List<AnswerBean> questions = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			List list3 = new ArrayList();
			list1 = idao.getItem(list.get(i).getId());
			for (int j = 0; j < list1.size(); j++) {
				list3.add(list1.get(j).getItem());
			}
			AnswerBean sbean = new AnswerBean(list.get(i).getQuestion(), list3,
					list1.get(0).getCorrectAnswer());
			questions.add(sbean);
		}
		return questions;
	}
}
