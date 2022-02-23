package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 类名: CloudConsumerOrderFeign80Application
 * 描述: TODO
 * 姓名: @author南风
 * 日期: 2022-02-23 15:19
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CloudConsumerOrderFeign80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrderFeign80Application.class,args);
    }
}
