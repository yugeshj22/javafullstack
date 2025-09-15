package com.yugesh.assignment.employees;

public class Devoloper extends Employee {
	private String lang;
	
	public Devoloper(String n, int id,double s, String l) {
		super(n,id,s);
		lang = l;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Language:"+lang);
	}

}
