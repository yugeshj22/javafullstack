package com.tns.lambda;

public class Lambda {
	public static void main(String[] args) {
		Lambda_inf f = (int x)->System.out.println(2*x);
		f.show(6);
	}
}
