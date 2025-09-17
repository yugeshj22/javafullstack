package com.tns.Static;

public class StaticVarExample {
    static int count = 0; // shared across all objects

    public StaticVarExample() {
        count++;
        System.out.println("Object created. Count: " + count);
    }

    public static void main(String[] args) {
        new StaticVarExample();
        new StaticVarExample();
        new StaticVarExample();
    }
}
