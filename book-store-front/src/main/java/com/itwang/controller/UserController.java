package com.itwang.controller;

import com.itwang.pojo.User;
import com.itwang.service.UserService;
import com.itwang.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
//    @Qualifier("userService")
    private UserService userService;

    /**
     * 到登录页
     * @param modelAndView
     * @return
     */
    @RequestMapping("/toLoginPage")
    public ModelAndView toLoginPage(ModelAndView modelAndView){
        modelAndView.setViewName("user/login");
        return modelAndView;
    }

    /**
     * 登录功能
     * @param modelAndView
     * @return
     */
    @PostMapping("/login")
    public ModelAndView userLogin(@RequestBody User user, ModelAndView modelAndView, HttpServletRequest request, HttpSession session){
        String username = request.getParameter("username");
        String password = MD5Utils.getMD5Utils(request.getParameter("password").replaceAll("==", ""));
        user = userService.userLogin(username,password);
        if (null != user){
            modelAndView.addObject("msg", "用户名或者密码不正确，登陆失败！");
            modelAndView.setViewName("user/login");
            return modelAndView;
         } else {
            session.setAttribute("userLogin",user);
            session.setMaxInactiveInterval(60*30);
            modelAndView.setViewName("user/login_success");
            return modelAndView;
        }
    }



    /**
     * 到注册页
     */
    @RequestMapping("/toRegisterPage")
    public ModelAndView toRegisterPage(ModelAndView modelAndView){
        modelAndView.setViewName("user/regist");
        return modelAndView;
    }
}
