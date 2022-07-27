package com.example.springbootjpa.service.impl;

import com.example.springbootjpa.dao.IBaseDao;
import com.example.springbootjpa.dao.IRoleDao;
import com.example.springbootjpa.entity.Role;
import com.example.springbootjpa.entity.query.RoleQueryBean;
import com.example.springbootjpa.service.IRoleService;
import com.github.wenhao.jpa.Specifications;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

/**
 * @Author 杨洲
 * @Date 2022/7/27 14:21
 */
@Service
public class RoleDoServiceImpl extends BaseDoServiceImpl<Role, Long> implements IRoleService {

    /**
     * roleDao.
     */
    private final IRoleDao roleDao;

    /**
     * init.
     *
     * @param roleDao2 role dao
     */
    public RoleDoServiceImpl(final IRoleDao roleDao2) {
        this.roleDao = roleDao2;
    }

    /**
     * @return base dao
     */
    @Override
    public IBaseDao<Role, Long> getBaseDao() {
        return this.roleDao;
    }

    /**
     * find page by query.
     *
     * @param roleQueryBean query
     * @param pageRequest   pageRequest
     * @return page
     */
    @Override
    public Page<Role> findPage(RoleQueryBean roleQueryBean, PageRequest pageRequest) {
        Specification<Role> specification = Specifications.<Role>and()
                .like(StringUtils.isNotEmpty(roleQueryBean.getName()), "name",
                        roleQueryBean.getName())
                .like(StringUtils.isNotEmpty(roleQueryBean.getDescription()), "description",
                        roleQueryBean.getDescription())
                .build();
        return this.roleDao.findAll(specification, pageRequest);
    }

}