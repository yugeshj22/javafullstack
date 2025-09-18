package com.tns.Abstract;

public class Rectangle extends Shape{
	private int length,breadth;
	public Rectangle(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	void Area() {
		super.area= length*breadth;
	}
}
