package com.linxx.springcloud.service;

import com.linxx.springcloud.entity.Payment;

import java.util.List;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-11 21:30
 * @Description: 支付服务类接口
 * @Project_name: cloudLearn
 */
public interface PaymentService1 {

    Payment queryById(Long id);

    List<Payment> queryAll(Payment payment);
}
