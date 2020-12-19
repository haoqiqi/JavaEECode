package com.kuang.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 动态的创建对象，通过反射
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // 获得Class对象
        Class<?> c1 = Class.forName("com.kuang.reflection.User");

        // 构造一个对象，被废弃了
//        User user = (User)c1.newInstance();
        // 本质上是调用了类的无参构造器，若没有则报错
        User user = (User) c1.getDeclaredConstructor().newInstance();
        System.out.println(user);   // Test01{name='null', id=0, age=0}

        // 通过构造器创建对象，为防止代码过长，可以分开写
//        user = (User) c1.getDeclaredConstructor(String.class, int.class, int.class).newInstance("xiaoming", 001, 15);
        Constructor<?> constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        Object user2 = constructor.newInstance("xiaoming", 001, 15);
        System.out.println(user2);   // Test01{name='xiaoming', id=1, age=15}

        // 通过反射获取方法
        User user3 = (User) c1.getDeclaredConstructor().newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);
        // invoke，激活（对象，值）
        setName.invoke(user3,"狂神");
        System.out.println(user3.getName());    // 狂神

        // 通过反射获取属性
        User user4 = (User) c1.getDeclaredConstructor().newInstance();
        Field name = c1.getDeclaredField("name");
        // private直接设置会出错，需要关闭访问权限，setAccessible设置为true，会降低程序的执行效率
        name.setAccessible(true);
        name.set(user4,"狂神2");
        System.out.println(user4.getName());    // 狂神2
    }
}
