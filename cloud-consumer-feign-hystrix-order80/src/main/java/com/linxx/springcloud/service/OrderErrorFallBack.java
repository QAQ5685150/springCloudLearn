package com.linxx.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * 类名: OrderErrorFallBack
 * 描述: 订单服务统一服务降级返回方法
 * 姓名: @author南风
 * 日期: 2022-02-25 11:30
 **/
@Component
public class OrderErrorFallBack implements OrderHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----------------paymentInfo_OK false fall back";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----------------paymentInfo_TimeOut false fall back";
    }
}
