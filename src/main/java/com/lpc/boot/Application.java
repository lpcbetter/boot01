package com.lpc.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author lpc
 * @create 2021-08-08 11:30
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        // 找出user类型的组件
//        String[] users = run.getBeanNamesForType(User.class);
//        for (String user : users) {
//            System.out.println(user);
//        }
//        DBHelper dbHelper = run.getBean(DBHelper.class);
//        System.out.println(dbHelper);
//        @Conditional
        // 判断容器中的配置类里面的内容是否生效
        System.out.println(run.containsBean("user"));
        System.out.println("master merge conflicts test");
        System.out.println("hot-fix commit");
        System.out.println("push test");
    }
}
