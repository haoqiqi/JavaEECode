package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Demo01.Student;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo01 {

    @Test
    public void testStu(){
        // 1. 加载Spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanDemo01.xml");
        // 2. 获取配置创建的对象
        Student student = context.getBean("student", Student.class);
        // 获取地址
        System.out.println(student);   // com.atguigu.spring5.User@6fdbe764
        // 调用方法
        student.studentTest(); // add...
    }
}
