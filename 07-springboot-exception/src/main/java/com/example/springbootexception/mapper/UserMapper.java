package com.example.springbootexception.mapper;

import com.example.springbootexception.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 杨洲
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-07-25 12:52:46
* @Entity com.example.springbootexception.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




