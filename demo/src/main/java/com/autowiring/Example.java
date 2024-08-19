package com.autowiring;

public class Example {
    private X x;

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public Example() {
    }

    public Example(X x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Example [x=" + x + "]";
    }
    
}
