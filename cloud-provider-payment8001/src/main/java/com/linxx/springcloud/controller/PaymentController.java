package com.linxx.springcloud.controller;

import com.linxx.springcloud.Utils.ResultUtils;
import com.linxx.springcloud.entity.CommonResult;
import com.linxx.springcloud.entity.Payment;
import com.linxx.springcloud.service.PaymentService;
import com.linxx.springcloud.service.PaymentService1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Resource
    private PaymentService1 paymentService1;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

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

    @GetMapping("/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("******element: " + service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() +
                    "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }

}
