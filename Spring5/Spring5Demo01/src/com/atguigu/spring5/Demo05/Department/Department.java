package com.atguigu.spring5.Demo05.Department;

public class Department {
    String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
