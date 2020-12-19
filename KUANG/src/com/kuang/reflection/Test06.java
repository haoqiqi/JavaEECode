package com.kuang.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// 获取类的信息
public class Test06 {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
//        Class<?> aClass = Class.forName("com.kuang.reflection.User");
        User user = new User();
        Class<? extends User> aClass = user.getClass();

        // 获取类的名字
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());

        // 获得类的属性
        System.out.println("==============");
        Field[] fields = aClass.getFields();    // 只能找到public属性

        fields = aClass.getDeclaredFields();    // 可以找到全部的属性
        for (Field field:fields
             ) {
            System.out.println(field);
        }
        /*
        private java.lang.String com.kuang.reflection.User.name
        private int com.kuang.reflection.User.id
        private int com.kuang.reflection.User.age
         */

        // 获取指定的属性，抛异常
        Field name = aClass.getDeclaredField("name");
        System.out.println(name);   // private java.lang.String com.kuang.reflection.User.name

        // 获得类的方法
        Method[] methods = aClass.getMethods(); // 获得本类及其父类的全部public方法
        Method[] methods1 = aClass.getDeclaredMethods();    // 获得本类的所有方法
        for (Method method : methods
        ) {
            System.out.println("getMethods：" + method);
        }
        System.out.println("==============");
        for (Method method : methods1
        ) {
            System.out.println("getDeclaredMethods：" + method);
        }
        System.out.println("==============");

        // 获得指定方法
        // 重载，所以需要输出参数类型
        Method getName = aClass.getMethod("getName", null);
        System.out.println(getName);    // public java.lang.String com.kuang.reflection.User.getName()
        Method setName = aClass.getMethod("setName", String.class);
        System.out.println(setName);    // public void com.kuang.reflection.User.setName(java.lang.String)
        System.out.println("==============");

        // 获得指定的构造器
        Constructor<?>[] constructors = aClass.getConstructors();
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("==============");
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("==============");

        // 获得指定的构造器
        Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("指定的构造器" + declaredConstructor); // 指定的构造器public com.kuang.reflection.User(java.lang.String,int,int)
    }
}
