package com.zouqiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zouqiang.utils.Log4j2;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello")
    public ModelAndView hello() {
        Log4j2.logger.info("hello");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello 成都！");
        mv.setViewName("NewFile");
        return mv;
    }

    // 返回helloWord.jsp页面
    @RequestMapping(value = "/helloWord")
    public String helloWord(Model model) {
        Log4j2.logger.info("helloWord");
        model.addAttribute("message2", "hello Word!");
        return "helloWord";
    }

}
