package com.yugesh.assignment.employees;

public class Manager extends Employee{
	private String department;
	public Manager(String n,int id, double s, String d) {
		super(n,id,s);
		department = d;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Department:"+department);
	}

}
