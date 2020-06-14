package com.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.info.mapper")
public class InfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(InfoApplication.class,args);
    }
}
