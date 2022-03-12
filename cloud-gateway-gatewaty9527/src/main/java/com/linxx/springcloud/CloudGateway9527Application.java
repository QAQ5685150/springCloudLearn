package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-03-11 20:28
 * @Description: cloud 网关主启动类
 * @Project_name: cloud_learn
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudGateway9527Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudGateway9527Application.class,args);
        }
}
