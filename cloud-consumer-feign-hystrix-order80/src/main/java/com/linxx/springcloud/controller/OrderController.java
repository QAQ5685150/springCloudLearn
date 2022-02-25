package com.linxx.springcloud.controller;

import com.linxx.springcloud.service.OrderHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * 类名: OrderController
 * 描述: hystrix订单控制器
 * 姓名: @author南风
 * 日期: 2022-02-24 16:33
 **/
@Slf4j
@RestController
@RequestMapping("order")
//@DefaultProperties(defaultFallback="paymentTimeOutFallbackMethod_Default")
public class OrderController {

    @Resource
    private OrderHystrixService orderHystrixService;

    @GetMapping("test")
    public String test() {
        return "test";
    }

    //@HystrixCommand
    @GetMapping("info/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String res = orderHystrixService.paymentInfo_OK(id);
        System.out.println(res);
        return res;
    };



//    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    @GetMapping("info/error/{id}")
    //@HystrixCommand
    public String paymentInfo_ERROR(@PathVariable("id") Integer id){
        //int a = 1/0;
        return orderHystrixService.paymentInfo_TimeOut(id);
    }

    /**
    *功能描述:局部指定异常，需要和原方法有相同的入参
    *@param id
    *@return java.lang.String
    **/
    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id){
        return "80____paymentInfo_ERROR_Handler___异常返回，接口调用方自动保护开启";
    }

    /**
    *功能描述:抛统一全局异常，不需要入参
    *@return String
    **/
    public String paymentTimeOutFallbackMethod_Default(){
        return "80____paymentInfo_ERROR_Handler___异常返回，接口调用方自动保护开启";
    }

}
