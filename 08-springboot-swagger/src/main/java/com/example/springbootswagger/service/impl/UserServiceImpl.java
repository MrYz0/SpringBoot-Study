package com.example.springbootswagger.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootswagger.entity.User;
import com.example.springbootswagger.service.UserService;
import com.example.springbootswagger.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 杨洲
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-07-25 16:23:24
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




