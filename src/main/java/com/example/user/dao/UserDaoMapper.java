package com.example.user.dao;


import com.example.user.entity.User;

import java.util.List;

public interface UserDaoMapper {

    User getUserById(long id);

    List<User> findAll();
}
