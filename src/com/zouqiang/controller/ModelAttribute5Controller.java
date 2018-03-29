package com.zouqiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zouqiang.entity.User;
import com.zouqiang.utils.Log4j2;

@Controller
public class ModelAttribute5Controller {
    @ModelAttribute("user")
    public User userModel5(@RequestParam("loginname") String loginname, @RequestParam("password") String password) {
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        return user;
    }

    @RequestMapping(value = "/login5")
    public String login5(@ModelAttribute("user") User user) {
        Log4j2.logger.info("login5");
        user.setUsername("超级管理员");
        return "loginForm/result5";
    }
}
