package com.atguigu.spring5.Demo01;

import java.lang.String;

/**
 * 创建类，定义属性，创建属性对应有参构造方法
 */
public class Student {
    int   num;
    String name;
    public Student(int num,String name){
        this.num = num;
        this.name = name;
    }

    public void studentTest(){
        System.out.println(num + ":" + name);
    }
}
