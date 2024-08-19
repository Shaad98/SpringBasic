package com.lifecycle;

public class X {
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
    public void init()
    {
        System.out.println("We are inside init method......");
    }
    
    @Override
    public String toString() {
        return "X [a=" + a + "]";
    }

    public void destroy()
    {
        System.out.println("We are inside destroy method...");
    }
}
