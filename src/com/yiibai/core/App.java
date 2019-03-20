package com.yiibai.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext
                ("com/yiibai/applicationContext.xml");
        HelloWorkd obj=(HelloWorkd)context.getBean("helloBean");
        obj.printHello();
    }
}
