package com.itwang.mapper;

import com.itwang.pojo.User;
import com.itwang.utils.MD5Utils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class UserMapperTest {

    @Test
    public void userLoginByUsernameAndPassword() throws IOException {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        String username = "zhangsan123456";
        String password = MD5Utils.getMD5Utils("123123123");

        User user = userMapper.userLoginByUsernameAndPassword(username, password);

        System.out.println("user = " + user);

        sqlSession.close();
    }
}