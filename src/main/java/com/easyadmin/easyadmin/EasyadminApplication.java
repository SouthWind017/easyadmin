package com.easyadmin.easyadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.easyadmin.project.dao")
public class EasyadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyadminApplication.class, args);
    }

}
