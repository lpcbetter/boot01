package com.lpc.boot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lpc
 * @create 2021-08-08 16:33
 */
//@Import({User.class, DBHelper.class})// 导入user类型的组件
//@ConditionalOnBean(name = "tom")// 容器中有tom这个组价的时候 这个类里面的内容才生效
@ConditionalOnMissingBean(name = "tom")
@Configuration(proxyBeanMethods = false)
//@ImportResource("classpath:beans.xml") // 导入spring的配置文件注解
public class MyConfig {

    @Bean("user")
    public User getUser(){
        return new User();
    }
}
