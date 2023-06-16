package com.itwang.service;

import com.itwang.pojo.User;

public interface UserService {
    User userLogin(String userName, String password);
}
