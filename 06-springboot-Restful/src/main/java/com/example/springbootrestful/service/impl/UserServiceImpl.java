package com.example.springbootrestful.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootrestful.entity.User;
import com.example.springbootrestful.service.UserService;
import com.example.springbootrestful.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 杨洲
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-07-24 13:47:00
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




