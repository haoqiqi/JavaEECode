package com.kuang.reflection;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        System.out.println("名字是：" + person.name);   // 名字是：null

        // 方式1：通过对象获得
        Class<? extends Person> c1 = person.getClass();
        System.out.println(c1.hashCode());  // 764977973

        // 方式2：forName获得
        Class<?> c2 = Class.forName("com.kuang.reflection.Student");
        System.out.println(c2.hashCode());  // 824909230

        // 方式3：通过类名.class获得
        Class<Student> c3 = Student.class;
        System.out.println(c3.hashCode());  // 824909230

        // 方式4：基本内置类型的包装类都有一个Type属性
        Class<Integer> c4 = Integer.TYPE;
        System.out.println(c4.hashCode());  // 589431969
        System.out.println(c4); // int

        // 获得父类类型
        Class<?> sc1 = c2.getSuperclass();
        System.out.println(sc1);    // class com.kuang.reflection.Person

    }
}
class Person{
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher() {
        this.name = "老师";
    }
}