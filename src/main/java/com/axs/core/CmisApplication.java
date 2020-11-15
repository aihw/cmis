package com.axs.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.axs.core.dao")
@SpringBootApplication
public class CmisApplication {

    public static void main(String[] args) {

        SpringApplication.run(CmisApplication.class, args);
    }

}
