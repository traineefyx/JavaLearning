package com.lightingtime.JavaLearning.config;

import com.lightingtime.JavaLearning.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Configuration 指明当前类是一个配置类，就是来替代之前的Spring配置文件
 *
 * 在配置文件中使用<bean></bean>标签添加组件
 */
@Configuration
public class AppConfig {

    @Bean
    public HelloService helloService() {
        System.out.println("配置类@Bean给容器添加组件");
        return new HelloService();
    }

}
