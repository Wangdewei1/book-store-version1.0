package com.itwang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@RestController
public class IndexController {
    @RequestMapping("/index.html")
    public ModelAndView toIndexPage(ModelAndView modelAndView, HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/test")
    public String toIndex(){
        return "forward:/static/img/logo.gif";
    }
}
