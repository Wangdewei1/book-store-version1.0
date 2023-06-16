package com.itwang.service.impl;

import com.itwang.mapper.UserMapper;
import com.itwang.pojo.User;
import com.itwang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User userLogin(String username, String password) {
        return userMapper.getUserByUsernameAndPwd(username,password);
    }


}
