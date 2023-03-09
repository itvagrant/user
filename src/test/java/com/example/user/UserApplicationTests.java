package com.example.user;

import com.example.user.dao.UserDaoMapper;
import com.example.user.dao.UserDaoNewMapper;
import com.example.user.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserApplicationTests {

    @Autowired
    UserDaoMapper userDao;

    @Autowired
    UserDaoNewMapper userDaoNew;
    @Test
    void contextLoads() {
        User userById = userDaoNew.getUserById(1);
        System.out.println(userById);
        List<User> all = userDaoNew.findAll();
        System.out.println(all);
    }

}
