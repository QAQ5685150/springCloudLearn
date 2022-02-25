package com.linxx.springcloud.controller;

import com.linxx.springcloud.Utils.ResultUtils;
import com.linxx.springcloud.entity.CommonResult;
import com.linxx.springcloud.entity.Payment;
import com.linxx.springcloud.service.PaymentService;
import com.linxx.springcloud.service.PaymentService1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-11 21:28
 * @Description: 支付控制类8002
 * @Project_name: cloudLearn
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Resource
    private PaymentService1 paymentService1;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/queryById/{id}")
    public CommonResult<Payment> queryById(@RequestParam("id") Long id){
        System.out.println("success! from " + serverPort);
        return ResultUtils.success(paymentService1.queryById(id));
    }

    @GetMapping("/queryAll")
    public CommonResult<List<Payment>> queryAll(Payment payment){
        System.out.println("success! from " + serverPort);
        return ResultUtils.success(paymentService1.queryAll(null));
    }

    @GetMapping("/feign/timeout")
    public CommonResult<String> timeout(){
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("success! from " + serverPort);
        return ResultUtils.success("success");
    }

}
