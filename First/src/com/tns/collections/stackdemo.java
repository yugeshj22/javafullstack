package com.tns.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class stackdemo {

	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());


	}

}
