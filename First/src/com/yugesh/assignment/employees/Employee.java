package com.yugesh.assignment.employees;

public class Employee {

	private String name;
	private int employeeid;
	private double salary;
	public  Employee(String n,int id,double s) {
		name = n;
		employeeid = id;
		salary = s;
	}
	public void displayInfo() {
		System.out.println("Name:"+name);
		System.out.println("ID:"+employeeid);
		System.out.println("Salary:"+salary);
	}
}
