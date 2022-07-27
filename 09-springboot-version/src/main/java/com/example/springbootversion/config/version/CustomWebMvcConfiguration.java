package com.example.springbootversion.config.version;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @Author 杨洲
 * @Date 2022/7/26 10:39
 */
@Configuration
public class CustomWebMvcConfiguration extends WebMvcConfigurationSupport {

    @Override
    public RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
        return new ApiVersionRequestMappingHandlerMapping();
    }
}
