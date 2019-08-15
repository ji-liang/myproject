package com.yq.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yq.entity.Role;
import com.yq.entity.User;
import com.yq.service.IRoleService;
import com.yq.service.IUserService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	@RequestMapping("/findAll.do")
	@RolesAllowed({"ADMIN"}) 
	public String findAll(ModelMap model){
		List<User> ulist=userService.findAll();
		model.put("userList", ulist);
		return "user-list";
	}
	@RequestMapping("/save.do")
	public String save(User user){
		userService.save(user);
		return "redirect:findAll.do";
	}
	@RequestMapping("/findById.do")
	public String findById(String id,ModelMap model){
		User user=userService.findById(id);
		model.put("user", user);
		return "user-show";
	}
	@RequestMapping("/findUserByIdAndAllRole.do")
	public String findUserByIdAndAllRole(String id ,ModelMap model){
		User user=userService.findById(id);
		List<Role> roles=userService.findOtherRoles(id);
		model.put("user", user);
		model.put("roleList", roles);
		return "user-role-add";
	}
	@RequestMapping("/addRoleToUser.do")
	public String addRoleToUser(String userId,String []ids){
		userService.addRoleToUser(userId,ids);
		return "redirect:findAll.do";
	}
}
