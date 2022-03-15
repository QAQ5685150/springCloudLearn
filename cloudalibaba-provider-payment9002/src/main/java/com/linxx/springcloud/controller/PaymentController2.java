package com.linxx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-03-14 15:46
 * @Description: TODO
 * @Project_name: cloud_learn
 */
@RestController
public class PaymentController2 {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment2/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos registry, serverPort: " + serverPort + "\t id" + id;
    }
}
