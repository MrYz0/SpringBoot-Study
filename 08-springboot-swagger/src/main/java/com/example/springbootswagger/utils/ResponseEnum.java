package com.example.springbootswagger.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @Author 杨洲
 * @Date 2022/7/25 12:54
 */
@Getter
@ToString
@AllArgsConstructor
public enum ResponseEnum {
    SUCCESS(20000,"成功"),
    ERROR(20001,"失败");

    private Integer code;

    private String message;
}
