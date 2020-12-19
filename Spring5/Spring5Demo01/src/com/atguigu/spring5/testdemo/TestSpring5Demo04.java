package com.atguigu.spring5.testdemo;


import com.atguigu.spring5.Demo03.Book;
import com.atguigu.spring5.Demo04.service.UserServics;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo04 {
    @Test
    public void testStu(){
        // 1. 加载Spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanDemo04.xml");
        // 2. 获取配置创建的对象
        UserServics userServics = context.getBean("userServics", UserServics.class);
        // 获取地址
        System.out.println(userServics);   // com.atguigu.spring5.User@6fdbe764
        // 调用方法
        userServics.add(); // add...
    }
}
