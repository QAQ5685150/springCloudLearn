package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 类名: CloudConsumerOrderConsul80Application
 * 描述: TODO
 * 姓名: @author南风
 * 日期: 2022-02-23 14:12
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerOrderConsul80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrderConsul80Application.class,args);
    }
}
