package com.yz.springbootdbh2jpa.service;

import com.yz.springbootdbh2jpa.entity.User;

import java.util.List;

/**
 * @Author 杨洲
 * @Date 2022/7/23 14:49
 */

public interface UserService {
    void addUser(User user);

    List<User> list();

}
