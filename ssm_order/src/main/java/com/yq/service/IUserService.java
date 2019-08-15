package com.yq.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.yq.entity.Role;
import com.yq.entity.User;

public interface IUserService extends UserDetailsService{
	public List<User> findAll();
	public void save(User user);
	public User findById(String id);
	public List<Role> findOtherRoles(String id);
	public void addRoleToUser(String userId, String[] ids);
	
}
