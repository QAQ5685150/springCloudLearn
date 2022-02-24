package com.linxx.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 类名: ApplicationConfig
 * 描述: restTemplate 配置类
 * 姓名: @author南风
 * 日期: 2022-02-23 14:16
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
