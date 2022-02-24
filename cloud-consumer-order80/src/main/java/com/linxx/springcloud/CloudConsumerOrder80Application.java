package com.linxx.springcloud;

import com.linxx.springcloud.loadBalance.myRules;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-11 22:41
 * @Description: 订单80消费端启动类
 * @Project_name: cloudLearn
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = myRules.class)
public class CloudConsumerOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder80Application.class, args);
    }
}
