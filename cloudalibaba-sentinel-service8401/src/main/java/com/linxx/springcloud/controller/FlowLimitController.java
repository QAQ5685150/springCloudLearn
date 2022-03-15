package com.linxx.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-03-15 14:52
 * @Description: TODO
 * @Project_name: cloud_learn
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "-----testA-----";
    }

    @GetMapping("/testB")
    public String testB(){
        return "-----testB-----";
    }

    @GetMapping("/testD")
    public String testD(){
        log.info("test d running");
        int a = 10 / 0;
        return "-----testD-----";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2) {
        //int age = 10/0;
        return "------testHotKey";
    }

    /**
     * sentinel降级兜底策略
     * @param p1
     * @param p2
     * @param exception
     * @return
     */
    public String deal_testHotKey (String p1, String p2, BlockException exception){
        return "------deal_testHotKey,o(╥﹏╥)o";
    }


}
