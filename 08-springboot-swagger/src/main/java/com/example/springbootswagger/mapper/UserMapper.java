package com.example.springbootswagger.mapper;

import com.example.springbootswagger.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 杨洲
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-07-25 16:23:24
* @Entity com.example.springbootswagger.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




