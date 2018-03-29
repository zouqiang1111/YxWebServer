package com.zouqiang.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.zouqiang.entity.Book;
import com.zouqiang.utils.Log4j2;

@Controller
@RequestMapping("/json")
public class BookController {
    @RequestMapping(value = "/testRequestBody")
    public void setJson(@RequestBody Book book, HttpServletResponse response) throws IOException {
        book.setAuthor("疯狂软件");
        response.setContentType("text/html;charset=UTF-8");
        Log4j2.logger.info(JSONObject.toJSONString(book));
        response.getWriter().println(JSONObject.toJSONString(book));
    }
}
