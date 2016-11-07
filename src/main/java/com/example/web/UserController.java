package com.example.web;

import com.example.domain.User;
import com.example.service.UserService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ShiCaiRui on 2016/10/28.
 */

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/toRegister")
    public String toLogin(){
        return "register";
    }

    @RequestMapping("/addUser")
    public String addUser(User user, HttpServletRequest request){
        userService.addUser(user);
        request.setAttribute("status","success");
        return "register";
    }
}
