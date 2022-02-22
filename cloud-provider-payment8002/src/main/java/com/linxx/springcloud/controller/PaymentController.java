package com.linxx.springcloud.controller;

import com.linxx.springcloud.Utils.ResultUtils;
import com.linxx.springcloud.entity.CommonResult;
import com.linxx.springcloud.entity.Payment;
import com.linxx.springcloud.service.PaymentService;
import com.linxx.springcloud.service.PaymentService1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-11 21:28
 * @Description: TODO
 * @Project_name: cloudLearn
 */
@RestController
@RequestMapping("payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Resource
    private PaymentService1 paymentService1;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/queryById")
    public CommonResult<Payment> queryById(Long id){
        System.out.println("success! from " + serverPort);
        return ResultUtils.success(paymentService1.queryById(id));
    }

    @GetMapping("/queryAll")
    public CommonResult<List<Payment>> queryAll(Payment payment){
        System.out.println("success! from " + serverPort);
        return ResultUtils.success(paymentService1.queryAll(null));
    }

}
