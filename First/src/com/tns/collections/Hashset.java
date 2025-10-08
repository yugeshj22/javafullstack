package com.tns.collections;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Java");                    // Add
		hashSet.add("Python");
		hashSet.add("Java");    // Duplicate ignored
		System.out.println(hashSet);
		hashSet.remove("Python");              // Remove
		System.out.println(hashSet.contains("Java")); // Check existence
		System.out.println("Size: " + hashSet.size()); // Size

	}

}
