package com.linxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-03-14 21:00
 * @Description: TODO
 * @Project_name: cloud_learn
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaConfigNacosClient3377Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConfigNacosClient3377Application.class,args);
    }
}
