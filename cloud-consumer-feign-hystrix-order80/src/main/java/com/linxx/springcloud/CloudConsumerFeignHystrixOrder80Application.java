package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 类名: CloudConsumerFeignHystrixOrder80Application
 * 描述: feign hystrix 启动类
 * 姓名: @author南风
 * 日期: 2022-02-24 16:33
 **/
@EnableHystrix
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class CloudConsumerFeignHystrixOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignHystrixOrder80Application.class,args);
    }
}
