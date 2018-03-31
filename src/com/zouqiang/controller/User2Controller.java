package com.zouqiang.controller;

import com.zouqiang.entity.User2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class User2Controller {
    @RequestMapping(value = "/registerForm",method = RequestMethod.GET)
    public String registerForm(Model model){
        User2 user2 = new User2("邹强", "男", "28","514584363");
        model.addAttribute("command",user2);
        return "jsp/springmvcTags/registerForm";
    }
}
