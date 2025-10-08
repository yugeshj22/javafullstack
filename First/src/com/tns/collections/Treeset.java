package com.tns.collections;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(30);                        // Add
		treeSet.add(10);
		treeSet.add(20);
		System.out.println("Sorted Set: " + treeSet);
		System.out.println("Removes 10");
		treeSet.remove(10);                     // Remove
		System.out.println("First: " + ((TreeSet<Integer>) treeSet).first()); // Access first
		System.out.println("Sorted Set: " + treeSet);    // View sorted

	}

}
