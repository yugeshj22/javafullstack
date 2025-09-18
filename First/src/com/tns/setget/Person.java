package com.tns.setget;

public class Person {
    private String name; // private field

    // Setter method → sets the value
    public void setName(String newName) {
    	System.out.println("Setter method called: setting name to " + newName);
    	name = newName;
       
    }

    // Getter method → returns the value
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("HiesenBerg"); // setting value using setter
        System.out.println("Name: " + p.getName()); // getting value using getter
    }
}