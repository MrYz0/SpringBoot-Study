package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author 杨洲
 * @Date 2022/7/27 14:12
 */
@Repository
public interface IUserDao extends IBaseDao<User, Long> {

}
