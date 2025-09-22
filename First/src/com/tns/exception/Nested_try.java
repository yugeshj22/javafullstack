package com.tns.exception;

public class Nested_try {

	public static void main(String[] args) {
		try {
            int[] arr = {1, 2, 3};

            try {
                int result = arr[1] / 0; // Throws ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of bounds");
        }


	}

}
