package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd(){
        // 1. 加载Spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        // 2. 获取配置创建的对象
        User user = context.getBean("user", User.class);
        // 获取地址
        System.out.println(user);   // com.atguigu.spring5.User@6fdbe764
        // 调用方法
        user.add(); // add...
    }
}
