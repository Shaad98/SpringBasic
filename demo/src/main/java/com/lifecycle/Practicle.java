package com.lifecycle;

// import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practicle {
    public static void main(String[] args) {
        // The Destroy method cannot call if it declare in class and xml . We need to tell the interface while destroying obj call this so
        // This functionality provide by AbstractApplicationContext so we use it 
        @SuppressWarnings("resource")
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/lifecycle_config.xml");
        context.registerShutdownHook();
        X x = context.getBean("xbean",X.class);
        System.out.println(x);
    }
}
