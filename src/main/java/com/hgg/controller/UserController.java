package com.hgg.controller;

import com.hgg.po.User;
import com.hgg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*
* 用户控制器
* */
@Controller
public class UserController {
    /*
    * 用户登录
    * */
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login.action",method = RequestMethod.POST)
    public String login (String loginAccount, String loginPassword, Model model,MockHttpSession session){
        User user = userService.findUser(loginAccount,loginPassword);
        if (user != null){
            session.setAttribute("USER_SESSION",user);
            return "customer";
        }
        model.addAttribute("msg","账号密码错误，请重新输入");
        return "login";
    }
}
