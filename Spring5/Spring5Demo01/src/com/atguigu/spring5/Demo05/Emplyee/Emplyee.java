package com.atguigu.spring5.Demo05.Emplyee;

import com.atguigu.spring5.Demo05.Department.Department;

public class Emplyee {
    String Emplyee_name;
    String Emplyee_gender;
    Department department;

    public void setEmplyee_name(String emplyee_name) {
        Emplyee_name = emplyee_name;
    }

    public void setEmplyee_gender(String emplyee_gender) {
        Emplyee_gender = emplyee_gender;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void add(){
        System.out.println(Emplyee_name + ":" + Emplyee_gender + ":" + department);
    }
}
