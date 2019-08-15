package com.my.controller;

import com.google.gson.Gson;
import com.my.pojp.UserInfo;
import com.my.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/add")
    public String addUser( String userInfo){
        Gson gson=new Gson();
         UserInfo user= gson.fromJson(userInfo,UserInfo.class);
        int i=userService.addUser(user);
        System.out.println("---------"+i);
        return i+"";
    }
    @RequestMapping("/check")
    public UserInfo check(String username,String password){
        return userService.checkLogin(new UserInfo(username,password));
    }
}
