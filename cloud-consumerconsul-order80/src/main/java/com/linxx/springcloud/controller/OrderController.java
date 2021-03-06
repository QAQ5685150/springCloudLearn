package com.linxx.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 类名: orderController
 * 描述: 订单控制器
 * 姓名: @author南风
 * 日期: 2022-02-23 14:15
 **/
@Slf4j
@RestController
@RequestMapping("order")
public class OrderController {

    final private String INVOKE_URL="http://172.16.100.200:8500";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("payment/consul")
    public String getPaymentInfo() {
        String info = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        log.info(info);
        return info;
    }
}
