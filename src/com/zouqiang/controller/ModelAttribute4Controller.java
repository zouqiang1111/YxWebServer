package com.zouqiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zouqiang.utils.Log4j2;

@Controller
public class ModelAttribute4Controller {
    @RequestMapping(value = "/login4")
    @ModelAttribute(value = "username")
    public String login4() {
        Log4j2.logger.info("login4");
        return "admin1";
    }
}
