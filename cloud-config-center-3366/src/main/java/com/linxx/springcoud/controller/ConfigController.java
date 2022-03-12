package com.linxx.springcoud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-03-11 23:52
 * @Description: @RefreshScope 实现热加载 自动获取刷新内容
 * @Project_name: cloud_learn
 */
@RestController
@RefreshScope
public class ConfigController {

    //yml配置了读取的文件 这里直接找到文件里面的key标签就能读出来了
    //所以我有点明白公司项目里面用bean注入的方式配置springboot各种组件了，原来是方便后期接入springCloud呀
    //就比如这里，换成配置文件，配上springCloud的包，启动后直接就可以从github上刷到最新的配置文件了，如果以后服务多了，也方便管理
    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Value("${word}")
    private String word;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return new String("username : " + username + "    " + "password : " + password + "    " + "word : " + word );
    }
}

