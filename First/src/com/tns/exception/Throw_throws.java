package com.tns.exception;

public class Throw_throws {
	// Method declares it might throw an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // Explicitly throw an exception
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // Try with age below 18
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

}
