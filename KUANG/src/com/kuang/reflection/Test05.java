package com.kuang.reflection;

// 获取类加载器
public class Test05 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);  // jdk.internal.loader.ClassLoaders$AppClassLoader@78308db1

        // 获取系统类加载器的父类加载器-->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent); // jdk.internal.loader.ClassLoaders$PlatformClassLoader@2d98a335

        // 获取扩展类加载器的父类加载器-->根加载器(c/c++)
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);    // null

        // 测试jd内部类的类加载器
        ClassLoader classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);    // null

        // 测试当前类的类加载器
        ClassLoader classLoader1 = Class.forName("com.kuang.reflection.Test05").getClassLoader();
        System.out.println(classLoader1);    // jdk.internal.loader.ClassLoaders$AppClassLoader@78308db1

        // 如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));  // E:\IdeaProjects\KUANG\out\production\KUANG

        // 双亲委派机制(保证安全性)
            // java.lang.String-->
    }
}
