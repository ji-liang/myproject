package com.my.service;

import com.my.pojp.UserInfo;


public interface UserService {
    int addUser(UserInfo userInfo);
    UserInfo checkLogin(UserInfo userInfo);
}
