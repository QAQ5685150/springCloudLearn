package com.linxx.springcloud.service;

import com.linxx.springcloud.entity.CommonResult;
import com.linxx.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类名: OrderFeignService
 * 描述: TODO
 * 姓名: @author南风
 * 日期: 2022-02-23 15:34
 **/
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface OrderFeignService {

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @PostMapping("payment/queryById/{id}")
    CommonResult<Payment> selectOne(@RequestParam("id") Long id);

    @PostMapping("payment/feign/timeout")
    String getFeignTimeOut();
}
