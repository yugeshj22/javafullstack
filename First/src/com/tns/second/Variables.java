package com.tns.second;

public class Variables {
	 int instanceVar = 10;

	    public void showVariables() {
	        // Local variable
	        int localVar = 20;

	        System.out.println("Instance Variable: " + instanceVar);
	        System.out.println("Local Variable: " + localVar);
	    }

	public static void main(String[] args) {
		Variables demo = new Variables();
		     demo.showVariables();

}

}
