package com.yz.springbootdevtools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 杨洲
 * @Date 2022/7/24 9:22
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("getAll")
    public String getAll(){
        return "getAll";
    }
}
