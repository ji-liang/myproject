package com.yq.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yq.entity.Role;
import com.yq.mapper.IRoleDaoMapper;
import com.yq.mapper.IUserDaoMapper;
@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDaoMapper userMapper;
	@Autowired
	private IRoleDaoMapper roleMapper;
	@Autowired
	private PasswordEncoder passwordEncoder;
//	public User login(User user) {
//		// TODO Auto-generated method stub
//		User db_user=userMapper.getUserByName(user.getUsername());
//		if(user.getPassword().equals(db_user.getPassword())){
//			return db_user;
//		}
//		return null;
//	}
	public UserDetails loadUserByUsername(String username)  {
		// TODO Auto-generated method stub
		com.yq.entity.User db_user=userMapper.getUserByName(username);
		User user=new User(db_user.getUsername(),db_user.getPassword(),db_user.getStatus()==1?true:false,true,true,true,getAuthority(db_user.getRoles()));
		return user;
	}
	public List<GrantedAuthority> getAuthority(List<Role> rlist){
		List<GrantedAuthority> list=new ArrayList<GrantedAuthority>();
		for (Role role : rlist) {
			list.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
		}
		return list;
	}
	public List<com.yq.entity.User> findAll() {
		// TODO Auto-generated method stub
		return userMapper.findAll();
	}
	public void save(com.yq.entity.User user) {
		//生成随机id
		user.setId(UUID.randomUUID().toString().replace("-", "").toUpperCase());
		//对密码进行加密操作
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userMapper.save(user);
	}
	public com.yq.entity.User findById(String id) {
		// TODO Auto-generated method stub
		return userMapper.findById(id);
	}
	public List<Role> findOtherRoles(String id) {
		// TODO Auto-generated method stub
		return roleMapper.findOtherRoles(id);
	}
	public void addRoleToUser(String userId, String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			roleMapper.addRoleToUser(userId,ids[i]);
		}
	}
}
