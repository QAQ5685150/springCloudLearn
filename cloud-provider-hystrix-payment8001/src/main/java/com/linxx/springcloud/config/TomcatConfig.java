//package com.linxx.springcloud.config;
//
//import cn.hutool.extra.ssh.Connector;
//import org.apache.coyote.http11.Http11NioProtocol;
//import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * 类名: TomcatConfig
// * 描述: tomcat 修改默认线程池参数
// * 姓名: @author南风
// * 日期: 2022-02-24 17:41
// **/
//@Configuration
//public class TomcatConfig {
//
//    @Bean
//    public ConfigurableServletWebServerFactory webServerFactory() {
//        TomcatServletWebServerFactory tomcatFactory = new TomcatServletWebServerFactory();
//        tomcatFactory.addConnectorCustomizers(new MyTomcatConnectorCustomizer());
//        //tomcatFactory.setPort(8005);
//        tomcatFactory.setContextPath("/api-g");
//        return tomcatFactory;
//    }
//
//    class MyTomcatConnectorCustomizer implements TomcatConnectorCustomizer {
//
//        @Override
//        public void customize(org.apache.catalina.connector.Connector connector) {
//            Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler();
//            //设置最大连接数
//            protocol.setMaxConnections(5000);
//            //设置最大线程数
//            protocol.setMaxThreads(300);
//            protocol.setConnectionTimeout(100000);
//        }
//
//    }
//}
