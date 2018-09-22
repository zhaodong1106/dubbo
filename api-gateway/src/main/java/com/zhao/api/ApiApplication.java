package com.zhao.api;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Raytine on 2018/9/15.
 */
@SpringBootApplication
@EnableDubboConfiguration
public class ApiApplication {
    public static void main(String[] args){
        SpringApplication.run(ApiApplication.class,args);
    }
}
