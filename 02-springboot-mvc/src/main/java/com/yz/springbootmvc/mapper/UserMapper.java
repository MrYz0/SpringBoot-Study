package com.yz.springbootmvc.mapper;

import com.yz.springbootmvc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 杨洲
 * @Date 2022/7/23 14:48
 */
@Repository
public interface UserMapper {
    List<User> userDemoList = new ArrayList<>();

    public default void save(User user) {
        userDemoList.add(user);
    }

    public default List<User> findAll() {
        return userDemoList;
    }
}
