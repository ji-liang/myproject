package com.yq.controller;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yq.entity.Permission;
import com.yq.entity.Role;
import com.yq.entity.User;
import com.yq.service.IRoleService;
import com.yq.service.IUserService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private IRoleService roleService;
	@RequestMapping("/findAll.do")
	public String findAll(ModelMap model){
		List<Role> rlist=roleService.findAll();
		model.put("roleList", rlist);
		return "role-list";
	}
	@RequestMapping("/save.do")
	public String save(Role role){
		roleService.save(role);
		return "redirect:findAll.do";
	}
	@RequestMapping("/findRoleByIdAndAllPermission.do")
	public String findRoleByIdAndAllPermission(String id,ModelMap model){
		Role roles=roleService.findById(id);
		List<Permission> permission=roleService.findOtherPermission(id);
		model.put("roles", roles);
		model.put("permissionList", permission);
		return "user-permission-add";	
	}
	@RequestMapping("/addPermissionToRole.do")
	public String addPermissionToRole(String permissionId,String[]roleId){
		roleService.addPermissionToRole(permissionId,roleId);
		return "redirect:findAll.do";
	}
	
}
