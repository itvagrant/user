package com.example.user.service;

import com.example.user.entity.User;
import com.github.pagehelper.PageInfo;

public interface UserService {

    public User getUserById(Long id);

    public PageInfo<User> getUserByPage(int pageNum, int pageSize);
}
