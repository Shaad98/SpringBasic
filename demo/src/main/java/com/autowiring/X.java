package com.autowiring;

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

    @Override
    public String toString() {
        return "X [x=" + this.a + "]";
    }
    
}
