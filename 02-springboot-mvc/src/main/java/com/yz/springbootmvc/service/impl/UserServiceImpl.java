package com.yz.springbootmvc.service.impl;

import com.yz.springbootmvc.entity.User;
import com.yz.springbootmvc.mapper.UserMapper;
import com.yz.springbootmvc.service.UserService;
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
