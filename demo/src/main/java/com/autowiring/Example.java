package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Example {
    
    private X x;

    public X getX() {
        return x;
    }
    @Autowired
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
