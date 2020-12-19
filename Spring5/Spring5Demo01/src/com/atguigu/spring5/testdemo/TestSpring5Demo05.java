package com.atguigu.spring5.testdemo;


import com.atguigu.spring5.Demo04.service.UserServics;
import com.atguigu.spring5.Demo05.Emplyee.Emplyee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo05 {
    @Test
    public void testStu(){
        // 1. 加载Spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanDemo05.xml");
        // 2. 获取配置创建的对象
        Emplyee emplyee = context.getBean("emplyee", Emplyee.class);
        // 获取地址
        System.out.println(emplyee);   // com.atguigu.spring5.User@6fdbe764
        // 调用方法
        emplyee.add(); // add...
    }
}
