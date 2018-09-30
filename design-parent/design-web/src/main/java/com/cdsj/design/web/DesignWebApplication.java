package com.cdsj.design.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.cdsj.design.dal.mapper")
public class DesignWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignWebApplication.class, args);
    }
}
