package com.example;

public class Student {
   private int id;
   private String name;
   private String city;
   public void setId(int id)
   {
        this.id = id;
   } 
   public void setName(String name)
   {
        this.name = name;
   } 
   public void setCity(String city)
   {
        this.city = city;
   } 
   public Student(int id , String name , String city)
   {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
   }
   public Student ()
   {
        super();
   }
   public String toString()
   {
        return "[ id = "+this.id+", name = "+this.name+", city = "+this.city+" ]";
   }
}
