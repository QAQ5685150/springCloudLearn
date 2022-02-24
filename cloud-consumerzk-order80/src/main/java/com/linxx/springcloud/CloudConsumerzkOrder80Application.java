package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-12 19:03
 * @Description: 订单80消费端启动类
 * @Project_name: cloudLearn
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerzkOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerzkOrder80Application.class, args);
    }
}