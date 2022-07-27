package com.example.springbootexception.config.exception;

import com.example.springbootexception.utils.R;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 杨洲
 * @Date 2022/7/25 15:01
 */
@Component
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        e.printStackTrace();
        return R.error().message("执行了全局异常....");
    }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public R error(ArithmeticException e){
        e.printStackTrace();
        return R.ok().message("执行了特定异常。。。。");
    }

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public R error(CustomException e){
            e.printStackTrace();
            return R.error().message(e.getMsg()).code(e.getCode());
    }

}
