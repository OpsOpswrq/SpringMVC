package com.feng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/father")
public class HelloController2 {
    @RequestMapping("/hello")
    public String Hello(Model model){
        model.addAttribute("msg","HelloSpring");
        return "hello";
    }
    @RequestMapping("/test")
    public String Hello2(ModelMap model){
        model.addAttribute("msg","HelloSpringMVC");
        return "hello";
    }
}
