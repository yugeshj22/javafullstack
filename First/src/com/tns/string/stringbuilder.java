package com.tns.string;

public class stringbuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(" Hello! This is string ");

        // Length
        System.out.println("Length: " + sb.length());

        // Replace (using index range)
        sb.replace(7, 11, "That"); // Replaces "This" with "That"
        System.out.println("After replace: " + sb);

        // Append (concatenation)
        sb.append(" Enjoy coding.");
        System.out.println("After append: " + sb);

        // Character at index
        System.out.println("Character at index 9: " + sb.charAt(9));

        // Insert
        sb.insert(0, "Start: ");
        System.out.println("After insert: " + sb);

        // Delete
        sb.delete(0, 7); // Removes "Start: "
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("Reversed: " + sb);

        // Restore original by reversing again
        sb.reverse();
        System.out.println("Restored: " + sb);


	}

}
