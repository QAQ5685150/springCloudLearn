package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 类名: CloudProviderHystrixPayment8001Application
 * 描述: 支付 服务提供 hystrix 8001 启动类
 * 姓名: @author南风
 * 日期: 2022-02-24 15:54
 **/
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class CloudProviderHystrixPayment8001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderHystrixPayment8001Application.class,args);
    }
}
