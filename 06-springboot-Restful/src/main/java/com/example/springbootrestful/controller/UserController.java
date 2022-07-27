package com.example.springbootrestful.controller;

import com.alibaba.fastjson.JSON;
import com.example.springbootrestful.entity.User;
import com.example.springbootrestful.result.R;
import com.example.springbootrestful.service.UserService;
import com.example.springbootrestful.validation.group.EditValidationGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Author 杨洲
 * @Date 2022/7/24 13:47
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("save")
    public R save(@Valid @RequestBody User user,BindingResult result ){
       if (result.hasErrors()){
           List<ObjectError> errors = result.getAllErrors();
           for (ObjectError error:errors) {
               System.out.println(error.getCode()+"-"+error.getDefaultMessage());
           }
           return R.error().message("格式错误");
       }
        return R.ok();
    }

    @PostMapping("edit")
    public R edit(@Validated(EditValidationGroup.class) @RequestBody User user,BindingResult result){
        System.out.println(JSON.toJSONString(result.getAllErrors()));
        return R.ok().message(JSON.toJSONString(result.getAllErrors()));
    }

    @GetMapping("getAll")
    public R getAll(){
        List<User> list = userService.list();
        return R.ok().data("list",list);
    }

}
