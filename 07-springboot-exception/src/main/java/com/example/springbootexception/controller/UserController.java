package com.example.springbootexception.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbootexception.config.exception.CustomException;
import com.example.springbootexception.entity.User;
import com.example.springbootexception.entity.vo.UserVo;
import com.example.springbootexception.service.UserService;
import com.example.springbootexception.utils.R;
import io.swagger.annotations.ApiParam;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 杨洲
 * @Date 2022/7/25 12:53
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("save")
    public R save(@RequestBody User user){
        userService.save(user);
        return R.ok();
    }

    @PostMapping("page/{current}/{limit}")
    public R page(
                  @ApiParam(name = "current", value = "当前页码", required = true)
                  @PathVariable Long current,
                  @ApiParam(name = "limit", value = "当前页码", required = true)
                  @PathVariable Long limit){
        Page<User> userPage =new Page<>(current,limit);
        userService.page(userPage,null);
        try {
            int i = 10/0;
        } catch (Exception e) {
            throw new CustomException(20001,"执行了自定义异常");
        }
        List<User> records = userPage.getRecords();
        long total = userPage.getTotal();
        return R.ok().data("total",total).data("records",records);
    }
}
