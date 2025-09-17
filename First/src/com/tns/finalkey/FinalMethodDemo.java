package com.tns.finalkey;
class Parent {
    final void showMessage() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // Cannot override showMessage()
    // void showMessage() { ... } // This would cause an error
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		Child c = new Child();
        c.showMessage(); 
	}

}
