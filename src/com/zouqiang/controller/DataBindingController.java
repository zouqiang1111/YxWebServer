package com.zouqiang.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.zouqiang.entity.User;
import com.zouqiang.utils.Log4j2;

@Controller
@SessionAttributes("user")
public class DataBindingController {
    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName) {
        Log4j2.logger.info("跳转到" + formName + ".jsp");
        String url = "";
        url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath()
                + request.getServletPath();
        if (request.getQueryString() != null) {
            url += "?" + request.getQueryString();
        }
        Log4j2.logger.info(url);
        return formName;
    }

    @RequestMapping(value = "/login")
    public String login(@RequestParam("loginname") String loginname, @RequestParam("password") String password,
                        Model model) {
        // 创建User对象，装载用户信息
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername("Zou Qiang");
        model.addAttribute("user", user);
        Log4j2.logger.info("跳转到welcome.jsp");
        return "welcome";
    }
}
