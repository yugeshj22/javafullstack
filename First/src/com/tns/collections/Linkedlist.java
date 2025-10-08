package com.tns.collections;
import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList list = new LinkedList<>();
		list.add(1);
		list.add("One");
		
		list.add("2");
		list.add("Two");
		
		list.addFirst(3);
		list.addLast("Three");
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);


	}

}
