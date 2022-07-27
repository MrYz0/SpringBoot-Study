package com.example.springbootswagger.controller;

import com.example.springbootswagger.entity.User;
import com.example.springbootswagger.service.UserService;
import com.example.springbootswagger.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 杨洲
 * @Date 2022/7/25 16:22
 */
@RestController
@RequestMapping("user")
@Api(tags = "用户接口")
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation("新增用户")
    @PostMapping("save")
    @ApiImplicitParam(name = "User", type = "body", dataTypeClass = User.class, required = true)
    public R save(
            @RequestBody User user){
        userService.save(user);
        return R.ok();
    }

    @ApiOperation("查询所有")
    @GetMapping("getAll")
    public R getAll(){
        List<User> list = userService.list();
        return R.ok().data("list",list);
    }
}
