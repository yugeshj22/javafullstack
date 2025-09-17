package com.tns.finalkey;

public class FinalVariableDemo {
    final int MAX_USERS = 100; // constant

    public void showLimit() {
        System.out.println("Max allowed users: " + MAX_USERS);
    }

    public static void main(String[] args) {
        FinalVariableDemo obj = new FinalVariableDemo();
        obj.showLimit();
        // obj.MAX_USERS = 200;This would cause a compile-time error
    }
}
