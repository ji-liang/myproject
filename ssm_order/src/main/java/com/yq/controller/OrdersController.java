package com.yq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.yq.entity.Orders;
import com.yq.service.IOrdersService;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	@Autowired
	private IOrdersService ordersService;
	@RequestMapping("/findAll.do")
	public String findAll(int page,int size,ModelMap model){
		List list=ordersService.findAll(page,size);
		PageInfo pageInfo=new PageInfo(list);
		model.put("pageInfo", pageInfo);
		return "orders-list";
	}
	@RequestMapping("/findById.do")
	public String findById(String id,ModelMap model){
		Orders order=ordersService.findById(id);
		model.put("orders", order);
		return "orders-show";
	}
}
