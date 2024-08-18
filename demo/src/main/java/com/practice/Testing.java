package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {
    public static void main(String[] args) {
        
    @SuppressWarnings("resource")
    ApplicationContext context = new ClassPathXmlApplicationContext("collection_pSchema_config.xml");
       Employee employee = (Employee) context.getBean("emp1");
        System.out.println(employee);
        
    }
}
