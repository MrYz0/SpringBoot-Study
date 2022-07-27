package com.example.springbootjpa.service;

import com.example.springbootjpa.entity.User;
import com.example.springbootjpa.entity.query.UserQueryBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
/**
 * @Author 杨洲
 * @Date 2022/7/27 14:17
 */

public interface IUserService extends IBaseService<User, Long> {

    /**
     * find by page.
     *
     * @param userQueryBean query
     * @param pageRequest   pageRequest
     * @return page
     */
    Page<User> findPage(UserQueryBean userQueryBean, PageRequest pageRequest);

}
