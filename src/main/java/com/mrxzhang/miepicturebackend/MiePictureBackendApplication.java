package com.mrxzhang.miepicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.mrxzhang.miepicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class MiePictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiePictureBackendApplication.class, args);
    }

}
