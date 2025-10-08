package com.tns.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("One");              // Add
		linkedHashSet.add("Two");
		System.out.println("Order preserved: " + linkedHashSet);
		linkedHashSet.remove("One");           // Remove
		System.out.println(linkedHashSet.contains("Two")); // Check existence
		System.out.println("Order preserved: " + linkedHashSet); // View order

	}

}
