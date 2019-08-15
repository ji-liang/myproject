package com.my.mapping;

import com.my.pojp.UserInfo;

import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<UserInfo> {
    @Select("select *from tb_user where username=#{username}")
     UserInfo checkUser(UserInfo userInfo);
    @Select("insert into tb_user values (0,#{username},#{password},#{phone},now(),#{code})")
    Integer addUser(UserInfo userInfo);
}
