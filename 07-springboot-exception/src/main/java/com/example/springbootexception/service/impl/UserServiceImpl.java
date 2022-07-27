package com.example.springbootexception.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootexception.entity.User;
import com.example.springbootexception.service.UserService;
import com.example.springbootexception.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 杨洲
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-07-25 12:52:46
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




