package com.example.user.service.impl;

import com.example.user.dao.UserDaoMapper;
import com.example.user.entity.User;
import com.example.user.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoMapper userDao;

    @Override
    public User getUserById(Long id) {
        /* TODO */
        return userDao.getUserById(id);
    }

    @Override
    public PageInfo<User> getUserByPage(int pageNum, int pageSize) {
        // 在需要分页的方法中调用 PageHelper.startPage 方法
        PageHelper.startPage(pageNum, pageSize);
        // 执行查询操作
        List<User> userList = userDao.findAll();
        // 将查询结果封装到 PageInfo 对象中
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }
}
