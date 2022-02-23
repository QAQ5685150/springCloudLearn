package com.linxx.springcloud.controller;

import com.linxx.springcloud.entity.CommonResult;
import com.linxx.springcloud.entity.Payment;
import com.linxx.springcloud.service.OrderFeignService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 类名: OrderFeignController
 * 描述: TODO
 * 姓名: @author南风
 * 日期: 2022-02-23 15:34
 **/
@RestController
@RequestMapping("order")
public class OrderFeignController {

    @Resource
    private OrderFeignService orderFeignService;

    @GetMapping("/selectOne/{id}")
    public CommonResult<Payment> selectOne(@PathVariable("id") Long id){
        return orderFeignService.selectOne(id);
    }

    @GetMapping("/feign/timeout")
    public String getFeignTimeOut() {
        return orderFeignService.getFeignTimeOut();
    }
}
