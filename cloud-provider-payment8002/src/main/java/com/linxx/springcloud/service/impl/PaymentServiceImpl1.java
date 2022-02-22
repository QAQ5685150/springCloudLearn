package com.linxx.springcloud.service.impl;

import com.linxx.springcloud.dao.PaymentDao;
import com.linxx.springcloud.entity.Payment;
import com.linxx.springcloud.service.PaymentService1;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-02-11 21:30
 * @Description: TODO
 * @Project_name: cloudLearn
 */
@Service
public class PaymentServiceImpl1 implements PaymentService1 {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public Payment queryById(Long id) {
        return paymentDao.queryById(id);
    }

    @Override
    public List<Payment> queryAll(Payment payment) {
        return paymentDao.queryAll(payment);
    }
}
