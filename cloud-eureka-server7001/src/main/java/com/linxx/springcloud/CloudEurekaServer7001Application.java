package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-12 16:39
 * @Description: 注册实例
 * @Project_name: cloudLearn
 */
@SpringBootApplication
@EnableEurekaServer  // 设置为服务注册中心 EurekaServer
public class CloudEurekaServer7001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001Application.class, args);
    }
}
