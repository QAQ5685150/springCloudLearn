package com.linxx.springcoud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-03-11 23:44
 * @Description: 配置中心客户端 主启动类
 * @Project_name: cloud_learn
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConfigCenter3355Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenter3355Application.class,args);
    }
}
