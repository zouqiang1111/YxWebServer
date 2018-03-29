package com.zouqiang.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.zouqiang.entity.Book;
import com.zouqiang.utils.Log4j2;

@Controller
@RequestMapping("/json")
public class BookController2 {
    @RequestMapping(value = "/testRequestBody2")
    @ResponseBody
    public Object getJson() {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book(1, "SpringMVC 企业应用实战", "疯狂软件"));
        list.add(new Book(2, "轻量级 JavaEE企业应用实战", "邹强"));
        Log4j2.logger.info(JSONObject.toJSONString(list));
        return list;
    }
}
