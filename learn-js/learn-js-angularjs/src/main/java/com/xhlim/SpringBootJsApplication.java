package com.xhlim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author xhlim@outlook.com
 * @create 2017-09-08 14:30
 */
@SpringBootApplication
public class SpringBootJsApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootJsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJsApplication.class, args);
    }

}
