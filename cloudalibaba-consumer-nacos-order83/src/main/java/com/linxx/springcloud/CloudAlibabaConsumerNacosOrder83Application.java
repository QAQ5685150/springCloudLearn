package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-03-14 16:44
 * @Description: TODO
 * @Project_name: cloud_learn
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudAlibabaConsumerNacosOrder83Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConsumerNacosOrder83Application.class,args);
    }
}
