package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan(basePackages = {"com.example.demo.dao"})
@SpringBootApplication
public class DemoApplication {
    public static ConfigurableApplicationContext context = null;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

       SpringApplication.run(DemoApplication.class, args);

        long endTime = System.currentTimeMillis();
    }

}
