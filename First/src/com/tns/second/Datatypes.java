package com.tns.second;

public class Datatypes {
public static void main(String[] args) {
	char a = 'G';
	 boolean e = true;
	 byte b = 4;
	 short s = 56;   
	 int i = 89;
	 long l = 12121;
	 float f = 4.7333434f;
    double d = 4.355453532;
    System.out.println("char: " + a);
    System.out.println("Boolean " + e);
    System.out.println("byte: " + b);
    System.out.println("short: " + s);
    System.out.println("integer: " + i);
    System.out.println("long: " + l);
    System.out.println("float: " + f);
    System.out.println("double: " + d);
   /*nonprimitive*/
    String greeting = "Hello";
    int[] marks = {85, 90, 78, 92, 88};
    System.out.println(greeting);
    System.out.println("Your marks:");
    for (int mark : marks) {
        System.out.println(mark);
    }


}
}
