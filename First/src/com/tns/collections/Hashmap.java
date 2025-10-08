package com.tns.collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Yugesh");               // Add
		hashMap.put(2, "Rahul");
		System.out.println(hashMap);
		hashMap.put(1, "Yugesh Updated");       // Overwrite
		hashMap.remove(2);                      // Remove
		System.out.println(hashMap.get(1));     // Access by key
		System.out.println("Keys: " + hashMap.keySet()); // View keys

	}

}
