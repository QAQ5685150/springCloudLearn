package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-03-11 22:58
 * @Description: cloud 配置中心主启动类
 * @Project_name: cloud_learn
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class CloudConfigCenter3344Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenter3344Application.class,args);
    }
}
