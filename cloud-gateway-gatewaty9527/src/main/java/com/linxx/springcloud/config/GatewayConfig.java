package com.linxx.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: @小脑斧不可爱
 * @Time: 2022-03-11 22:00
 * @Description:  配置网关 第一种方式 yml   第二种方式 bean注入
 * @Project_name: cloud_learn
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_rote_baidu", r -> r.path("/baidu").uri("https://www.baidu.com/")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator1(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_rote_bilibili", r -> r.path("/bilibili").uri("https://www.bilibili.com/")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_rote_cnblogs", r -> r.path("/cnblogs").uri("https://www.cnblogs.com/")).build();
        return routes.build();
    }
}
