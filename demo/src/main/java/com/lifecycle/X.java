package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class X implements InitializingBean,DisposableBean {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public X() {
    }

    public X(int a) {
        this.a = a;
    }
    public void alive()
    {
        System.out.println("We are inside init method......");
    }
    
    @Override
    public String toString() {
        return "X [a=" + a + "]";
    }

    public void dead()
    {
        System.out.println("We are inside destroy method...");
    }

    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'destroy'");
        System.out.println("We are calling destroy by Interface name DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'afterPropertiesSet'");
        System.out.println("We are calling init by Interface name InitializingBean");
    }
}
