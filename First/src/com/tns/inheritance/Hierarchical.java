package com.tns.inheritance;

public class Hierarchical {
	public void vehicle() {
		System.out.println("Vehicle class");
	}
}
class car extends Hierarchical{
	public void car1() {
		System.out.println("Vehicle: Car");
	}
}
class bike extends Hierarchical{
	public void bike1() {
		System.out.println("Vehicle: Bike");
	}
}
class cycle extends Hierarchical{
	public void cycl() {
		System.out.println("Vehicle: Cycle");
	}
}