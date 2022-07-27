package com.example.springbootrestful.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import com.example.springbootrestful.validation.group.EditValidationGroup;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
@Builder
public class User implements Serializable {

    /**
     * 主键ID
     */
    @TableId
    @NotEmpty(message = "could not be empty",groups = {EditValidationGroup.class}) // 这里定为空，对于addUser时是不合适的
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}