package com.atguigu.spring5.Demo03;

public class Book {
    private String bname;
    private String bauthor;
    private String baddress;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress;
    }

    public void show(){
        System.out.println(bname+":"+bauthor+":"+baddress);
    }

}
