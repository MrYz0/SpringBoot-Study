package com.example.springbootjpa.service;

import com.example.springbootjpa.entity.Role;
import com.example.springbootjpa.entity.query.RoleQueryBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * @Author 杨洲
 * @Date 2022/7/27 14:20
 */
public interface IRoleService extends IBaseService<Role, Long> {

    /**
     * find page by query.
     *
     * @param roleQueryBean query
     * @param pageRequest   pageRequest
     * @return page
     */
    Page<Role> findPage(RoleQueryBean roleQueryBean, PageRequest pageRequest);

}