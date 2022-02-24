package com.linxx.springcloud.controller;

import com.linxx.springcloud.entity.CommonResult;
import com.linxx.springcloud.entity.Payment;
import com.linxx.springcloud.service.OrderFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 类名: OrderFeignController
 * 描述: feign 订单控制器
 * 姓名: @author南风
 * 日期: 2022-02-23 15:34
 **/
@Slf4j
@RestController
@RequestMapping("order")
public class OrderFeignController {

    @Resource
    private OrderFeignService orderFeignService;

    @GetMapping("/selectOne/{id}")
    public CommonResult<Payment> selectOne(@PathVariable("id") Long id){
        CommonResult<Payment> paymentCommonResult = null;
        try {
            paymentCommonResult = orderFeignService.selectOne(id);
        } catch (Exception e) {
            log.info(e.getMessage());
            paymentCommonResult = new CommonResult<>(404,"not fond!");
        }
        return paymentCommonResult;
    }

    @GetMapping("/feign/timeout")
    public String getFeignTimeOut() {
        return orderFeignService.getFeignTimeOut();
    }
}

