package com.zouqiang.controller;

import com.zouqiang.entity.Dept;
import com.zouqiang.entity.Employee;
import com.zouqiang.entity.User3;
import com.zouqiang.utils.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class User3Controller {
    @RequestMapping(value = "/checkboxForm", method = RequestMethod.GET)
    public String registerForm(Model model) {
        User3 user3 = new User3();
        user3.setReader(true);
        //设置boolean变量reader的值为true，页面的checkbox复选框会选中
        List<String> list = new ArrayList<>();
        //为集合courses添加"Java EE"、"Spring MVC"、"语文"、"英语"，页面的checkbox复选框这几项会被选中
        list.add("Java EE");
        list.add("Spring MVC");
        list.add("语文");
        list.add("英语");
        Log4j2.logger.info(list);
        user3.setCourses(list);
        List<String> courseList = new ArrayList<>();
        courseList.add("语文");
        courseList.add("数学");
        courseList.add("英语");
        courseList.add("历史");
        Log4j2.logger.info(user3.toString());
        Log4j2.logger.info(courseList);
        model.addAttribute("user3", user3);
        model.addAttribute("courseList", courseList);
        return "springmvcTags/checkboxForm";
    }

    @RequestMapping(value = "/checkboxForm2", method = RequestMethod.GET)
    public String registerForm2(Model model) {
        User3 user3 = new User3();
        user3.setReader(true);
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        //为集合变量courses添加 Java EE 和 语文，页面的checkbox复选框这两项会选中
        user3.setCourses(list);
        //页面展现的可供选择的复选框内容courseMap
        HashMap<String, String> courseMap = new HashMap<>();
        courseMap.put("1","Java EE");
        courseMap.put("2","语文");
        courseMap.put("3","英语");
        Log4j2.logger.info(user3.toString());
        Log4j2.logger.info(courseMap);
        model.addAttribute("user3", user3);
        model.addAttribute("courseMap", courseMap);
        return "springmvcTags/checkboxForm2";
    }

    @RequestMapping(value = "/checkboxsForm3", method = RequestMethod.GET)
    public String registerForm3(Model model) {
        Employee employee = new Employee();
        Dept dept = new Dept(1, "开发部");
        //为集合变量depts添加Dept对象，该对象id=1,deptName=开发部,页面的checkbox复选框这一项会被选中
        List<Dept> list = new ArrayList<>();
        list.add(dept);
        employee.setDepts(list);
        //页面展现的可供选择的复选框内容deptList
        List<Dept> deptList = new ArrayList<>();
        deptList.add(dept);
        deptList.add(new Dept(2,"销售部"));
        deptList.add(new Dept(3,"智慧医疗部"));
        //model中添加属性employee和deptList
        Log4j2.logger.info(employee.toString());
        Log4j2.logger.info(deptList);
        model.addAttribute("employee",employee);
        model.addAttribute("deptList",deptList);
        return "springmvcTags/checkboxsForm3";
    }
}
