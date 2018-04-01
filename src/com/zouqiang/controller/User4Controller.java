package com.zouqiang.controller;

import com.zouqiang.entity.User4;
import com.zouqiang.utils.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebParam;

@Controller
public class User4Controller {
    @RequestMapping(value = "/registerForm4", method = RequestMethod.GET)
    public String registerForm4(Model model) {
        User4 user4 = new User4();
        model.addAttribute("user4", user4);
        Log4j2.logger.info(user4.toString());
        return "springmvcTags/registerForm4";
    }

    @InitBinder
    public void initBinder(DataBinder binder) {
        //设置验证的类为User4Validater
        binder.setValidator(new User4Validater());
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Validated User4 user4, Errors errors, Model model) {
        if (errors.hasFieldErrors())
            return "springmvcTags/registerForm4";
        model.addAttribute("user", user4);
        Log4j2.logger.info(user4.toString());
        return "springmvcTags/registerForm";
    }
}
