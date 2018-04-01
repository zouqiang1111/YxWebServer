package com.zouqiang.controller;

import com.zouqiang.entity.FormatString;
import com.zouqiang.utils.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: 邹强
 * @CreateDate: 2018/4/1 23:22
 **/
@Controller
public class FormatForm {
    @RequestMapping(value = "formatTest", method = RequestMethod.POST)
    public String formatTest(@ModelAttribute FormatString formatString, Model model) {
        Log4j2.logger.info(formatString.toString());
        model.addAttribute("formatForm", formatString);
        return "formatSuccess";
    }
}
