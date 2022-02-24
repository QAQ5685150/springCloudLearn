package com.linxx.springcloud.loadBalance;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类名: myRules
 * 描述: 自定义负载均衡算法规则
 * 姓名: @author南风
 * 日期: 2022-02-23 14:56
 **/
@Configuration
public class myRules {


    @Bean
    public IRule rules(){
        //todo 自己实现一个负载均衡算法
        return new RoundRobinRule();
    }
}
