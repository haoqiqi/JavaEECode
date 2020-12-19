package com.company.equals;

public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("haoqiqi", 5000, 1999, 01, 02);
        Employee alice2 = new Employee("haoqiqi2", 5000, 1999, 02, 02);
        Employee alice3 = new Employee("haoqiqi3", 5000, 1999, 03, 02);
        Employee alice4 = alice1;

        System.out.println(alice1.hashCode());
        System.out.println(alice1.toString());

        Manager boss = new Manager("haoqiqi4", 50000,2000, 01, 01);
        boss.setBonus(5000);
        System.out.println(boss);
        System.out.println(boss.toString());
        System.out.println(boss.hashCode());

    }
}
