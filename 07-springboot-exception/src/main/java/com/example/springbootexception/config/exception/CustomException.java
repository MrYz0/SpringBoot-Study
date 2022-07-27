package com.example.springbootexception.config.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 杨洲
 * @Date 2022/7/25 15:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomException extends RuntimeException{
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 返回消息
     */
    private String msg;
}
