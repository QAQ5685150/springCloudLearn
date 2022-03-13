package com.linxx.springcloud.service.impl;

import com.linxx.springcloud.service.IMessageProviderService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-03-12 19:49
 * @Description: TODO
 * @Project_name: cloud_learn
 */
@EnableBinding(Source.class)
public class MessageProviderService implements IMessageProviderService {

    @Resource
    private MessageChannel output; // 消息发送管道

    @Override
    public String send()
    {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: "+serial);
        return null;
    }

}
