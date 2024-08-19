package com.ref_inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Result {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ref_inject/ref_config.xml");
        A a = (A)context.getBean("aref");
        System.out.println(a);
    }
}
