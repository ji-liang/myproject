package com.yq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.yq.entity.User;

public interface IUserDaoMapper {
	@Select("select * from users where username=#{username}")
	@Results({ @Result(id = true, property = "id", column = "id"), @Result(column = "username", property = "username"),
			@Result(column = "email", property = "email"), @Result(column = "password", property = "password"),
			@Result(column = "phoneNum", property = "phoneNum"), @Result(column = "status", property = "status"),
			@Result(column = "id", property = "roles", javaType = List.class, many = @Many(select = "com.yq.mapper.IRoleDaoMapper.findRoleByUserId") ) })
	public User getUserByName(String username);

	@Select("select * from users")
	public List<User> findAll();

	@Insert("insert into users values(#{id},#{email},#{username},#{password},#{phoneNum},#{status})")
	public void save(com.yq.entity.User user);

	@Select("select * from users where id=#{id}")
	@Results({ @Result(id = true, property = "id", column = "id"), @Result(column = "username", property = "username"),
			@Result(column = "email", property = "email"), @Result(column = "password", property = "password"),
			@Result(column = "phoneNum", property = "phoneNum"), @Result(column = "status", property = "status"),
			@Result(column = "id", property = "roles", javaType = List.class, many = @Many(select = "com.yq.mapper.IRoleDaoMapper.findRoleByUserId") ) })
	public com.yq.entity.User findById(String id);
}
