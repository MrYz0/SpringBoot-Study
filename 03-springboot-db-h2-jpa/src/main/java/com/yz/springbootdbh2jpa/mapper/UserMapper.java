package com.yz.springbootdbh2jpa.mapper;

import com.yz.springbootdbh2jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 杨洲
 * @Date 2022/7/23 14:48
 */
@Repository
public interface UserMapper extends  JpaRepository<User, Integer> {

}
