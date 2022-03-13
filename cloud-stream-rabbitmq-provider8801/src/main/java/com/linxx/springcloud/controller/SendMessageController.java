package com.linxx.springcloud.controller;

import com.linxx.springcloud.service.IMessageProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-03-12 19:48
 * @Description: TODO
 * @Project_name: cloud_learn
 */
@RestController
public class SendMessageController
{
    @Resource
    private IMessageProviderService messageProviderService;

    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return messageProviderService.send();
    }

}

