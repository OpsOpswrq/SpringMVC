package com.feng.controller;

import com.feng.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test2")
public class HelloController6 {
    @RequestMapping("/t1")
    public String test1(String name){
        System.out.println(name);
        return "/hello1";
    }
    @RequestMapping("/t2")
    public String test2(@RequestParam("username")String name){
        System.out.println(name);
        return "/hello1";
    }
    @RequestMapping("/t3")
    public String test3(User user){
        System.out.println(user);
        return "/hello";
    }
}
