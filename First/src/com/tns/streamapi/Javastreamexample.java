package com.tns.streamapi;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Javastreamexample {
	public static void main(String[] args) {
		List<Product> p=new ArrayList<Product>(); 
		p.add(new Product(1,"dell",24999f));
		p.add(new Product(1,"mac",64999f));
		p.add(new Product(1,"lenevo",54999f));
		List<Float> p1=p.stream().map(p3->p3.price).collect(Collectors.toList());
		System.out.println(p1);
		List<Float> p2=p.stream().filter(p3->p3.price>28999).map(p3->p3.price).collect(Collectors.toList());
		System.out.println(p2);
	}

}
