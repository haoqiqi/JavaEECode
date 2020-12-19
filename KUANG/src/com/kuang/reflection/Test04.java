package com.kuang.reflection;

// 测试类什么时候会发生初始化
public class Test04 {

    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 1. 主动引用
//        Son son = new Son();
        /*
        main类被加载
        父类静态代码块初始化
        子类静态代码块初始化
         */

        // 2. 反射也会产生主动引用，但是只会加载一次，因此输出不变
//        Class.forName("com.kuang.reflection.Son");
        /*
        main类被加载
        父类静态代码块初始化
        子类静态代码块初始化
         */

        // 3. 不会产生类的引用的方法
        // 通过子类引用父类的静态变量，不会导致子类初始化
//        System.out.println(Son.b);
        /*
        main类被加载
        父类静态代码块初始化
        2
         */

        // 通过数组定义类引用
//        Son[] array = new Son[5];
        /*
        main类被加载
         */

        // 调用常量
        System.out.println(Son.M);
        /*
        main类被加载
        1
         */
    }
}

class Father{
    static {
        System.out.println("父类静态代码块初始化");
    }
    static int b = 2;
}

class Son extends Father{
    static {
        System.out.println("子类静态代码块初始化");
        m = 300;
    }
    static int m = 100;
    static final int M = 1;
}
