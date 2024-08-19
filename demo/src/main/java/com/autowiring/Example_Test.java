package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example_Test {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("com/autowiring/autowire_config.xml");
        Example example = context.getBean("exam",Example.class);
        System.out.println(example.getX().getA());
        System.out.println(example);
    }
}
