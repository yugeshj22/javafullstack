package com.tns.Abstract;

public class Square extends Shape {
	private int side;
	public Square(int side) {
		this.side = side;
	}
	void Area() {
		super.area= side*side;
	}

}
