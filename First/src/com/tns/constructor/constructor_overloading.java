package com.tns.constructor;
 class User {

    private String username;
    private int age;

    // Default constructor
    public User() {
        username = "Guest";
        age = 18;
    }

    // Parameterized constructor
    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("Username: " + username + ", Age: " + age);
    }

}
public class constructor_overloading {

	public static void main(String[] args) {
		User u1 = new User(); // uses default constructor
        User u2 = new User("Yugesh", 23); // uses parameterized constructor

        u1.showDetails();
        u2.showDetails();


	}

}
