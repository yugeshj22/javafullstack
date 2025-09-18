package com.tns.Abstract;

public class AbstractDemo {
	public static void main(String[] args) {
		Square s = new Square(20);
		s.Area();
		s.show();
		
		Rectangle r = new Rectangle(30,20);
		r.Area();
		r.show();
	}
}
