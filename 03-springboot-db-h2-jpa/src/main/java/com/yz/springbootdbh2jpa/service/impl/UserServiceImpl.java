package com.yz.springbootdbh2jpa.service.impl;

import com.yz.springbootdbh2jpa.entity.User;
import com.yz.springbootdbh2jpa.mapper.UserMapper;
import com.yz.springbootdbh2jpa.service.UserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 杨洲
 * @Date 2022/7/23 14:49
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.save(user);
    }

    @Override
    public List<User> list() {
        return userMapper.findAll();
    }
}
