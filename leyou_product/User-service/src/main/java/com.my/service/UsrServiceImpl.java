package com.my.service;

import com.my.mapping.UserMapper;
import com.my.pojp.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsrServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public int addUser(UserInfo userInfo) {
        return userMapper.addUser(userInfo);
    }

    @Override
    public UserInfo checkLogin(UserInfo userInfo) {
        UserInfo user=userMapper.checkUser(userInfo);
        if (user!=null){
            if (user.getPassword().equals(userInfo.getPassword())){
                return user;
            }else{
                return null;
            }
        }
        return null;
    }
}
