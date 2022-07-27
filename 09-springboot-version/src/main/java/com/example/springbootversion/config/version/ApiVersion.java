package com.example.springbootversion.config.version;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
 * @Author 杨洲
 * @Date 2022/7/26 10:38
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface ApiVersion {
    String value();
}