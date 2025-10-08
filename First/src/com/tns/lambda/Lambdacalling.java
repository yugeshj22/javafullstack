package com.tns.lambda;

import java.util.ArrayList;

public class Lambdacalling {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		
		l.add(101);
		l.add(102);
		l.add(103);
		l.add(104);
		l.add(105);
		
		l.forEach(n->System.out.println(n));


	}

}
