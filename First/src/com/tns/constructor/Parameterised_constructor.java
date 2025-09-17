package com.tns.constructor;
class Box{
	int a,b,c;
	Box(int x, int y, int z){
		a=x;
		b=y;
		c=z;
		System.out.println("This is constructor");
	}
	public void volume(){
		int vol = a*b*c;
		System.out.println(vol);
	}
}

public class Parameterised_constructor {

	public static void main(String[] args) {
		Box b = new Box(20,30,60);
		b.volume();

	}

}
