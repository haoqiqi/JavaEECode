package com.atguigu.spring5.testdemo;


import com.atguigu.spring5.Demo03.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo03 {
    @Test
    public void testStu(){
        // 1. 加载Spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beanDemo03.xml");
        // 2. 获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        // 获取地址
        System.out.println(book);   // com.atguigu.spring5.User@6fdbe764
        // 调用方法
        book.show(); // add...
    }
}
