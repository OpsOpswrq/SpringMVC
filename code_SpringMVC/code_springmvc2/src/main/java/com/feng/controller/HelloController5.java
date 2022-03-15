package com.feng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test1")
public class HelloController5 {
    @RequestMapping("/t1")
    public String test1(){
        return "/index.jsp";
    }
    @RequestMapping("/t2")
    public String test2(){
        return "forward:/index.jsp";
    }
    @RequestMapping("/t3")
    public String test3(){
        return "redirect:/index.jsp";
    }

}
