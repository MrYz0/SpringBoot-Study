package com.example.springbootswagger.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author 杨洲
 * @Date 2022/7/25 16:20
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30).apiInfo(
                new ApiInfoBuilder()
                        .contact(new Contact("杨洲",
                                "https://mryz0.github.io/JavaStudy/",
                                "2569901191@qq.com"))
                        .description("DEMO项目的接口测试文档")
                        .termsOfServiceUrl("https://mryz0.github.io/JavaStudy/")
                        .title("Swagger3测试项目")
                        .build()
        );
    }
}
