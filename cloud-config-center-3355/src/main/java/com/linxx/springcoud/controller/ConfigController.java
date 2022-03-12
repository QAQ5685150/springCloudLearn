package com.linxx.springcoud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-03-11 23:52
 * @Description: @RefreshScope 实现热加载 自动获取刷新内容
 * @Project_name: cloud_learn
 */
@RestController
public class ConfigController {

    //yml配置了读取的文件 这里直接找到文件里面的key标签就能读出来了
    @Value("${test}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}

