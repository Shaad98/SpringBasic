package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Example {
    @Autowired
    @Qualifier("object")
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
