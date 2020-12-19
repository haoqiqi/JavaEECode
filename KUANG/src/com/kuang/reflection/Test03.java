package com.kuang.reflection;

import java.lang.annotation.ElementType;

// 测试所有类型的class
public class Test03 {
    public static void main(String[] args) {
        Class<Object>       c1 = Object.class;    // 类
        Class<Comparable>   c2 = Comparable.class;    //接口
        Class<String[]>     c3 = String[].class;    //一维数组
        Class<int[][]>      c4 = int[][].class;  //二维数组
        Class<Override>     c5 = Override.class;    //注解
        Class<ElementType>  c6 = ElementType.class;  //枚举
        Class<Integer>      c7 = Integer.class;  //基本数据类型
        Class<Void>         c8 = void.class;    //void
        Class<Class>        c9 = Class.class;  //Class
        System.out.println(c1);     // class java.lang.Object
        System.out.println(c2);     // interface java.lang.Comparable
        System.out.println(c3);     // class [Ljava.lang.String;
        System.out.println(c4);     // class [[I
        System.out.println(c5);     // interface java.lang.Override
        System.out.println(c6);     // class java.lang.annotation.ElementType
        System.out.println(c7);     // class java.lang.Integer
        System.out.println(c8);     // void
        System.out.println(c9);     // class java.lang.Class

        // 只要元素类型与维度一样，就是同行一个class
        int[] a = new int[10];
        int[] b = new int[1000];
        System.out.println(a.getClass().hashCode());    // 764977973
        System.out.println(b.getClass().hashCode());    // 764977973
    }
}
