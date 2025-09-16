package com.tns.inheritance;
class Parent {
    void greet() {
        System.out.println("Hello from Parent!");
    }
}

class Child extends Parent {
    void greet() {
        super.greet(); // Calls Parent's greet()
        System.out.println("Hello from Child!");
    }
}
public class Super {

	public static void main(String[] args) {
		Child C = new Child();
		C.greet();

	}

}
