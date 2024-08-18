package com.practice;
import java.util.*;
public class Employee {
    private String name;
    private List<String> phoneNo;
    private Set<String> addresses;
    private Map<String,String> courses;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(List<String> phoneNo) {
        this.phoneNo = phoneNo;
    }
    public Set<String> getAddresses() {
        return addresses;
    }
    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }
    public Map<String, String> getCourses() {
        return courses;
    }
    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", phoneNo=" + phoneNo + ", addresses=" + addresses + ", courses=" + courses
                + "]";
    }
    public Employee(String name, List<String> phoneNo, Set<String> addresses, Map<String, String> courses) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.addresses = addresses;
        this.courses = courses;
    }
    public Employee() {
    }
    
    
}
