package com.example.user.controller;

import com.example.user.entity.User;
import com.example.user.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/finduserbyid/{uid}")
    public User findUserById(@PathVariable("uid") Long id){
        User user = userService.getUserById(id);
        return user;
    }

    @GetMapping("/finduserbypage/{pageNum}/{pageSize}")
    public PageInfo<User> findUserByPage(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        PageInfo<User> pageInfo = userService.getUserByPage(pageNum, pageSize);
        return pageInfo;
    }


}
