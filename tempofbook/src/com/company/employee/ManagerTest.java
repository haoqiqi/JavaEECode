package com.company.employee;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("haoqiqi", 5000, 2020, 1,2);
        boss.setBonus(5000);
        Employee[] stuff = new Employee[3];
        stuff[0] = boss;
        stuff[1] = new Employee("haoqiqi1", 3500, 2020, 1, 3);
        stuff[2] = new Employee("haoqiqi2", 3000, 2020, 1, 4);
        for (Employee e:stuff
             ) {
            System.out.println("name:" + e.getName() +
                    ", salary:" + e.getSalary() +
                    ", hire day:" + e.getHireDay());
        }
    }
}
