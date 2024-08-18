package com.constructor_injector;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Apply_Addition {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("com/constructor_injector/configuration_ci.xml");
        Addition addition = (Addition)context.getBean("add");
        System.out.println(addition);
    }
}
