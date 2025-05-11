package com.bootdo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@ServletComponentScan
@MapperScan("com.bootdo.*.dao")
@EnableCaching
@EnableTransactionManagement
public class BootdoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootdoApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    后台管理系统启动成功      ヾ(◍°∇°◍)ﾉﾞ");
    }
}