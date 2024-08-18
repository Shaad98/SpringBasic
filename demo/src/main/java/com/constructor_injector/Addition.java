package com.constructor_injector;

public class Addition {
    private int a;
    private int b;
    Addition(double a,double b)
    {
        this.a = (int)a;
        this.b = (int)b;
        System.out.println("Constructor parameter data type are : {double,double}");
    }
    Addition(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("Constructor parameter data type are : {int,int}");
    }
    Addition(String a,String b)
    {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Constructor parameter data type are : {String,String}");
    }
    public String toString()
    {
        return "The values are [a = "+this.a+" b = "+this.b+" ] ";
    }
}
