package com.my.action;



import java.util.List;

import com.my.entity.Answer;
import com.my.entity.ItemBean;
import com.my.service.AswerService;
import com.opensymphony.xwork2.ActionSupport;



public class indexAction extends ActionSupport{
	private AswerService as=new AswerService();
	private ItemBean ibean;
	private List<Answer>items;
	private List list=null;
	
	

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public List<Answer> getItems() {
		return items;
	}

	public void setItems(List<Answer> items) {
		this.items = items;
	}

	public ItemBean getIbean() {
		return ibean;
	}

	public void setIbean(ItemBean ibean) {
		this.ibean = ibean;
	}

	public String add() throws Exception {	
		as.addAnswer(ibean.getTitle(), list, ibean.getSelect());
		return null;
	}

	public String get() throws Exception {
		int page=1;
		if(ibean==null){
			ibean=new ItemBean(page);
			items=as.getAll(page, 3);
			
		}else{	
			ibean=new ItemBean(2);
			System.out.println(ibean.getPage());
			items=as.getAll(ibean.getPage(), 1);
		}		
		return "upkeep";
	}
	
	public String del() throws Exception {
		// TODO Auto-generated method stub
		int i=as.delItem(ibean.getId());
		return null;
	}
}
