package com.tns.collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<String> ar = new ArrayList<>();
		ar.add("Hyderabad");
		ar.add("Delhi");
		ar.add("Vizag");
		System.out.println(ar);
		System.out.println("Delhi presents in list:"+ar.contains("Delhi"));
		ar.remove("Vizag");
		System.out.println(ar);

	}

}
