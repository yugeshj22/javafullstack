package com.tns.inheritance;

public class Hybrid {
	public void show1() {
		System.out.println("Parentclass \n");
	}
}
class child1 extends Hybrid{
	public void show2() {
	System.out.println("Child class");
    }
}
class gchild extends child1{
	public void show3() {
		System.out.println("Grand child");
	}
}
class child2 extends Hybrid{
	public void show4() {
		System.out.println("Child class 2");
	}
}