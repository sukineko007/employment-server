package com.manage.employ;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.manage.employ.mapper"})
public class EmployApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployApplication.class, args);
    }

}
