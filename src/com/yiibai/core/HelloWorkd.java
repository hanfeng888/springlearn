package com.yiibai.core;

public class HelloWorkd {
    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void printHello(){
        System.out.println("Spring 3:Hello!"+name);

    }
}
