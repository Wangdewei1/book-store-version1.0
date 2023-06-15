package com.itwang.mapper;

import com.itwang.pojo.User;
import com.itwang.pojo.UserExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {
    /**
     * 测试查询user总数量
     *
     */
//    @Autowired
//    SqlSessionFactory sqlSessionFactory;
    @Test
    public void countByExample() throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserExample userExample = new UserExample();
//        UserExample.Criteria criteria = userExample.createCriteria();

        int rows = userMapper.countByExample(userExample);

        System.out.println("rows = " + rows);

    }
}