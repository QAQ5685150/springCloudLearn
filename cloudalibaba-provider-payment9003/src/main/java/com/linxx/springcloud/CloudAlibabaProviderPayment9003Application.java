package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-03-15 14:34
 * @Description: TODO
 * @Project_name: cloud_learn
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaProviderPayment9003Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaProviderPayment9003Application.class,args);
    }
}
