package com.yz.springbootdbh2jpa.controller;


import com.yz.springbootdbh2jpa.entity.User;
import com.yz.springbootdbh2jpa.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 杨洲
 * @Date 2022/7/23 14:48
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("add")
    public User add(User user){
        userService.addUser(user);
        return user;
    }
    @GetMapping("list")
    public List<User> list() {
        return userService.list();
    }
}





