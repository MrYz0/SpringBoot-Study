package com.example.springbootversion.entity;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@Data
@Builder
public class User implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;


    private static final long serialVersionUID = 1L;
}