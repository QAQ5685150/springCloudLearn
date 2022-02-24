package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 类名: CloudProviderPayment8004Application
 * 描述: 支付 服务提供 8004 启动类
 * 姓名: @author南风
 * 日期: 2022-02-23 14:04
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderPayment8004Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8004Application.class,args);
    }
}
