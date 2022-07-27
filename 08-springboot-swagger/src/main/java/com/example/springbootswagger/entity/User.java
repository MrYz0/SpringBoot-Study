package com.example.springbootswagger.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
@ApiModel(value = "用户对象", description = "用户对象实体类")
public class User implements Serializable {
    /**
     * 主键ID
     */
    @TableId
    @ApiModelProperty(value = "用户id")
    private Long id;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "用户姓名")
    private String name;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private Integer age;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}