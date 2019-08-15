package com.yq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yq.entity.Permission;
import com.yq.entity.User;
import com.yq.service.IPermissionService;

@Controller
@RequestMapping("/permission")
public class PermissionController {
	@Autowired
	private IPermissionService permissionService;
	@RequestMapping("/findAll.do")
	public String findAll(ModelMap model){
		model.put("permissionList", permissionService.findAll());
		return "permission-list";
	}
	@RequestMapping("/save.do")
	public String save(Permission permission){
		permissionService.save(permission);
		return "redirect:findAll.do";
	}
}
