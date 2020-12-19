package com.company.abstractClasses;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("haoqiqi", 5000, 2020, 01, 02);
        people[1] = new Student("haoqiqi1", "Computer");
        for (Person p:people
             ) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
