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
    public ModelAndView toIndexPage(ModelAndView modelAndView) throws UnsupportedEncodingException {
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/test")
    public String toIndex(){
        return "forward:/static/img/logo.gif";
    }
}
