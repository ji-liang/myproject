package com.my.controller;

import com.google.gson.Gson;
import com.my.pojp.UserInfo;

import com.my.util.TestSMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/register")
    public String addUser(HttpSession session, UserInfo userInfo) {
        String code = session.getAttribute("code").toString();
        if (code.equals(userInfo.getCode())) {
            Gson gson = new Gson();
            String json = gson.toJson(userInfo);
            String url = "http://user-service/user/add?userInfo=" + json;
            String flagstatu = restTemplate.getForObject(url, String.class, json);
            return "redirect:/login.jsp";
        }
        return "redirect:/register.jsp";
    }

    @RequestMapping("/send")
    public String send(HttpSession session, String code, String phone) {
        TestSMS test = new TestSMS();
        String flag = test.sendMessage(phone);
        session.setAttribute("code", flag);
        return null;
    }
}
