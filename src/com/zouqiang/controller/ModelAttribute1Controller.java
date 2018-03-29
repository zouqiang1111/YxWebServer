package com.zouqiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zouqiang.utils.Log4j2;

@Controller
public class ModelAttribute1Controller {
    // @ModelAttribute(value="loginname")
    @ModelAttribute("loginname")
    public String userModel1(@RequestParam("loginname") String loginname) {
        return loginname;
    }

    @RequestMapping(value = "/login1")
    public String login1() {
        Log4j2.logger.info("跳转到result1.jsp");
        return "loginForm/result1";
    }

}
