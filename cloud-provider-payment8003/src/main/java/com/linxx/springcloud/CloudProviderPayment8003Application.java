package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-12 18:45
 * @Description: TODO
 * @Project_name: cloudLearn
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class CloudProviderPayment8003Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8003Application.class, args);
    }

}
