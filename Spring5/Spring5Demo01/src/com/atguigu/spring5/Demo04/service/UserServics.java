package com.atguigu.spring5.Demo04.service;

import com.atguigu.spring5.Demo04.dao.UserDao;

public class UserServics {

    // 1. 创建UserDao属性类型，生成set方法
    private UserDao ud;

    public void setUd(UserDao ud) {
        this.ud = ud;
    }

    public void add(){
        System.out.println("servise.add....");
        ud.update();
    }


}
