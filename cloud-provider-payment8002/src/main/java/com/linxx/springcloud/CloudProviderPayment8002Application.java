package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-11 21:07
 * @Description: 启动类
 * @Project_name: cloudLearn
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPayment8002Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8002Application.class, args);
    }
}
