package com.tns.polymorphism;

public class overloading {

	    // Overloading by number of parameters
	    public void display(String msg) {
	        System.out.println("Message: " + msg);
	    }

	    public void display(String msg, int count) {
	        System.out.println("Message repeated " + count + " times:");
	        for (int i = 0; i < count; i++) {
	            System.out.println(msg);
	        }
	    }

	    // Overloading by type of parameters
	    public void display(int number) {
	        System.out.println("Integer: " + number);
	    }

	    public void display(double number) {
	        System.out.println("Double: " + number);
	    }

	    // Overloading by sequence of parameters
	 
	    public void display(String name, double score) {
	        System.out.println("Name: " + name + ", Score: " + score);
	    }

	    public void display(double score, String name) {
	        System.out.println("Score: " + score + ", Name: " + name);
	    }


	    public static void main(String[] args) {
	        overloading demo = new overloading();

	        // Number of parameters
	        demo.display("Hello");
	        demo.display("Hello", 3);
	        System.out.println("Number of parameters\n");

	        // Type of parameters
	        demo.display(42);
	        demo.display(3.14);
	        System.out.println("Types of parameters\n");

	        // Sequence of parameters
	        demo.display("Yugesh", 22.5);
	        demo.display(23.5, "Yugesh");
	        System.out.println("Sequence of parameters");
	    }
	}

