package com.feng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test4")
public class HelloController7 {
    @RequestMapping("/t1")
    public String test1(String name, Model model){
        System.out.println(name);
        model.addAttribute("name",name);
        return "/hello";
    }
}
