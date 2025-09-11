package com.tns.second;

public class Operators {

	public static void main(String[] args) {
		 int a = 10, b = 3;
	        System.out.println("Arithmetic Operators:");
	        System.out.println("Addition: " + (a + b));
	        System.out.println("Subtraction: " + (a - b));
	        System.out.println("Multiplication: " + (a * b));
	        System.out.println("Division: " + (a / b));
	        System.out.println("Modulus: " + (a % b));

	        // Relational Operators
	        System.out.println("\nRelational Operators:");
	        System.out.println("a == b: " + (a == b));
	        System.out.println("a != b: " + (a != b));
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a < b: " + (a < b));
	        System.out.println("a >= b: " + (a >= b));
	        System.out.println("a <= b: " + (a <= b));

	        // Logical Operators
	        boolean x = true, y = false;
	        System.out.println("\nLogical Operators:");
	        System.out.println("x && y: " + (x && y));
	        System.out.println("x || y: " + (x || y));
	        System.out.println("!x: " + (!x));

	        // Assignment Operators
	        int c = 5;
	        System.out.println("\nAssignment Operators:");
	        c += 3; // c = c + 3
	        System.out.println("c += 3: " + c);
	        c *= 2; // c = c * 2
	        System.out.println("c *= 2: " + c);

	        // Unary Operators
	        int d = 7;
	        System.out.println("\nUnary Operators:");
	        System.out.println("d++: " + (d++)); 
	        System.out.println("++d: " + (++d)); 
	        System.out.println("d--: " + (d--)); 
	        System.out.println("--d: " + (--d)); 

	        // Bitwise Operators
	        int m = 5, n = 3;
	        System.out.println("\nBitwise Operators:");
	        System.out.println("m & n: " + (m & n)); 
	        System.out.println("m | n: " + (m | n)); 
	        System.out.println("m ^ n: " + (m ^ n)); 
	        System.out.println("~m: " + (~m));       
	}

}
