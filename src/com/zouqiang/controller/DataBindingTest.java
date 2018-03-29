package com.zouqiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zouqiang.utils.Log4j2;

@Controller
public class DataBindingTest {
    @RequestMapping(value = "/pathVariableTest/{userId}")
    public void pathVariableTest(@PathVariable Integer userId) {
        Log4j2.logger.info("通过@PathVariable获得数据：" + userId);
    }

    @RequestMapping(value = "/requestHeaderTest")
    public void requestHeaderTest(@RequestHeader("User-Agent") String userAgent,
                                  @RequestHeader(value = "Accept") String[] accepts) {
        Log4j2.logger.info("通过@RequestHeader获得数据：" + userAgent);
        for (String accept : accepts) {
            Log4j2.logger.info(accept);
        }
    }

    @RequestMapping(value = "/cookieValueTest")
    public void cookieValueTest(@CookieValue(value = "JSESSIONID", defaultValue = "") String sessionId) {
        Log4j2.logger.info("通过@CookieValue获得数据：" + sessionId);
    }
}
