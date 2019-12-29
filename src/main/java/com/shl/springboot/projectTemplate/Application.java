package com.shl.springboot.projectTemplate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


/*
通过@ImportResource来加载xml文件
 */
//@ImportResource(value = "classpath:dubbo/dubbo-consumer.xml")


@MapperScan(value = "com.shl.springboot.projectTemplate.domain.mapper")
@SpringBootApplication //Spring Boot项目的核心注解，主要目的是开启自动配置
public class Application /*extends SpringBootServletInitializer*/{

    static {
        System.setProperty("Log4jContextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



//    /**
//     * 不使用springboot集成的tomcat，要使用自己优化的tomcat，需要实现SpringBootServletInitializer#configure
//     * @param builder
//     * @return
//     */
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        //设置启动类，用于独立tomcat运行的入口
//        return builder.sources(Application.class);
//    }
}
