package com.tns.string;

public class stringbuffer {

	public static void main(String[] args) {
		
		        StringBuffer s = new StringBuffer(" Hello! This is string ");

		        // Length
		        System.out.println("Length: " + s.length());

		        // Trim (StringBuffer doesn't have trim, so convert to String temporarily)
		        String trimm = s.toString().trim();
		        System.out.println("Trimmed: " + trimm);

		        // Case conversion (requires conversion to String)
		        System.out.println("Upper case: " + trimm.toUpperCase());
		        System.out.println("Lower case: " + trimm.toLowerCase());

		        // Substring (again, via String)
		        System.out.println("Substring: " + trimm.substring(5, 9));

		        // Replace (StringBuffer has replace method with index range)
		        s.replace(7, 11, "That"); // Replacing "This" with "That"
		        System.out.println("Replace: " + s);

		        // Concatenation (use append)
		        StringBuffer g = new StringBuffer("Hi,");
		        g.append("There");
		        System.out.println("Concatenation: " + g);

		        // Character at index
		        System.out.println("At index 9: " + s.charAt(9));

		        // Split (requires conversion to String)
		        String sentence = "Java is powerful";
		        String[] words = sentence.split(" ");
		        for (String word : words) {
		            System.out.println(word);
		        }

		        // Equality check (via String)
		        StringBuffer sb1 = new StringBuffer("is");
		        StringBuffer sb2 = new StringBuffer("string");

		        System.out.println(s.equals(sb1));
		        System.out.println(s.equals(sb2));

		        // Starts/Ends with (via String)
		        System.out.println("Starts with 'Hello': " + trimm.startsWith("Hello"));
		        System.out.println("Ends with '.': " + trimm.endsWith("."));

		        // Contains (via String)
		        System.out.println("Contains 'is': " + trimm.contains("is"));

		        // Index of substring
		        System.out.println("Index of 'Welcome': " + trimm.indexOf("Hello"));

		        // Last index of character
		        System.out.println("Last index of 'o': " + trimm.lastIndexOf('o'));

		        

}
}