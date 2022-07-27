package com.example.springbootrestful.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @Author 杨洲
 * @Date 2022/7/24 13:47
 */
@Getter
@ToString
@AllArgsConstructor
public enum ResponseEnum {
    SUCCESS(20000,"请求成功"),
    ERROR(20001,"请求失败");

    private Integer code;

    private String message;

}
