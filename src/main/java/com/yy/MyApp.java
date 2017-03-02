package com.yy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动的入口
 * Created by yaoliang on 2017/2/24.
 */

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {

        System.out.println("welcome to you!");
        SpringApplication.run(MyApp.class, args);
    }
}
