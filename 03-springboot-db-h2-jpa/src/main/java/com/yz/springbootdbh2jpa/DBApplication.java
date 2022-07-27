package com.yz.springbootdbh2jpa;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DBApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DBApplication.class, args);
        SpringApplication application = new SpringApplication(DBApplication.class);
        /**
         * Banner.Mode.OFF:关闭;
         * Banner.Mode.CONSOLE:控制台输出，默认方式;
         * Banner.Mode.LOG:日志输出方式;
         */
        application.setBannerMode(Banner.Mode.OFF); // here
        application.run(args);

    }

}
