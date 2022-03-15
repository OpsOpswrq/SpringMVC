package com.feng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/test")
public class HelloController4 {
    @RequestMapping("/t1")
    public void test1(HttpServletResponse resp, HttpServletRequest req, HttpSession httpSession) throws IOException {
        System.out.println("进入了这个方法");
        httpSession.setAttribute("msg","这个是test1");
        resp.sendRedirect("../index.jsp");

    }
    @RequestMapping("/t2")
    public void test2(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("msg","这个是test2");
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
