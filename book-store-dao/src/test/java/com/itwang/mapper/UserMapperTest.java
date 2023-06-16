package com.itwang.mapper;

import com.itwang.pojo.UserExample;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

//@ContextConfiguration(locations = "classpath:spring-core.xml")
//@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {

    Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    /**
     * 测试查询user总数量
     *
     */
//    @Autowired
//    SqlSessionFactory sqlSessionFactory;

//    @Autowired
//    UserMapper userMapper;
/*    @Test
    public void countByExample() throws IOException {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-core.xml");

        UserMapper userMapper = applicationContext.getBean(UserMapper.class);

        UserExample userExample = new UserExample();
//        UserExample.Criteria criteria = userExample.createCriteria();

        int rows = userMapper.countByExample(userExample);

        System.out.println("rows = " + rows);
    }*/


    /**
     * 测试查询全部userList
     */
/*    @Test
    public void selectByExample() throws IOException {
//        UserExample userExample = new UserExample();
//        UserExample.Criteria criteria = userExample.createCriteria();
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("spring-core.xml"));
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = userMapper.selectByExample(userExample);
        List<User> userList = userMapper.findAll();
        logger.debug(userList + "");
    }*/
}