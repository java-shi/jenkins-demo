package com.sfy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: Sfy
 * @Date: 2020/7/1 0001 14:43
 */
@SpringBootApplication
public class MyApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MyApp.class);
    }
}
