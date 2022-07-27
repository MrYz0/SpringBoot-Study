package com.example.springbootrestful.mapper;

import com.example.springbootrestful.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 杨洲
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-07-24 13:47:00
* @Entity com.example.springbootrestful.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




