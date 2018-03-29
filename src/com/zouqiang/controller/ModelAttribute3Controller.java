package com.zouqiang.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zouqiang.entity.User;
import com.zouqiang.utils.Log4j2;

@Controller
public class ModelAttribute3Controller {
    private static List<User> userList;

    public ModelAttribute3Controller() {
        super();
        userList = new ArrayList<User>();
        User user1 = new User("admin1", "123qwe,.", "管理员1");
        User user2 = new User("admin2", "123qwe,.", "管理员2");
        userList.add(user1);
        userList.add(user2);
    }

    public User find(String loginname, String password) {
        for (User user : userList) {
            if (user.getLoginname().equals(loginname) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    @ModelAttribute
    public User userModel3(@RequestParam("loginname") String loginname, @RequestParam("password") String password) {
        return find(loginname, password);
    }

    @RequestMapping(value = "/login3")
    public String login3() {
        Log4j2.logger.info("查询是否存在User对象");
        return "loginForm/result3";
    }
}
