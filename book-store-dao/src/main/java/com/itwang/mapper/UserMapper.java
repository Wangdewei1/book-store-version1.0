package com.itwang.mapper;

import com.itwang.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User userLoginByUsernameAndPassword(@Param("username") String username,@Param("password") String password);
}
