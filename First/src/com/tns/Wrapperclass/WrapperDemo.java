package com.tns.Wrapperclass;

public class WrapperDemo {
	    public static void main(String[] args) {
	        // Example 1: Integer (int ↔ Integer)
	        int num = 100;
	        Integer boxedInt = num;           // Boxing
	        int unboxedInt = boxedInt;        // Unboxing
	        System.out.println("Integer - Boxed: " + boxedInt + ", Unboxed: " + unboxedInt);

	        // Example 2: Double (double ↔ Double)
	        double price = 99.99;
	        Double boxedDouble = price;       // Boxing
	        double unboxedDouble = boxedDouble; // Unboxing
	        System.out.println("Double - Boxed: " + boxedDouble + ", Unboxed: " + unboxedDouble);

	        // Example 3: Character (char ↔ Character)
	        char grade = 'A';
	        Character boxedChar = grade;      // Boxing
	        char unboxedChar = boxedChar;     // Unboxing
	        System.out.println("Character - Boxed: " + boxedChar + ", Unboxed: " + unboxedChar);
	    }
}
