package com.linxx.springcloud.controller;

import com.linxx.springcloud.entity.CommonResult;
import com.linxx.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-11 22:43
 * @Description: TODO
 * @Project_name: cloudLearn
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    //服务提供方地址写死了
    //public static final String PAYMENT_URL = "http://localhost:8001";

    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @GetMapping("/consumer/payment/queryById")
    public CommonResult<Payment> queryById(Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/queryById/?id=" + id, CommonResult.class);
    }


}
