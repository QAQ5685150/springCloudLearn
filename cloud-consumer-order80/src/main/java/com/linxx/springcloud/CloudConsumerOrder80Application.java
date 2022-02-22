package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-11 22:41
 * @Description: TODO
 * @Project_name: cloudLearn
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConsumerOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder80Application.class, args);
    }
}
