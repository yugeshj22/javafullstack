package com.tns.string;

public class string_ops {

	public static void main(String[] args) {
		String s = " Hello! This is string ";
		//length
		System.out.println("Length:"+s.length());
		//Trim
		String trimm = s.trim();
		System.out.println("Trimmed:"+trimm);
		//Case conversion
		System.out.println("Upper case:"+trimm.toUpperCase());
		System.out.println("Lower case:"+trimm.toLowerCase());
		//substring
		System.out.println("Substring:"+trimm.substring(5,9));
		//replace
		System.out.println("Replace:"+trimm.replace("This", "That"));
		//concatenation
		String g="Hi,";
		String con=g.concat("There");
		System.out.println("Concatenation:"+con);
		//index
		System.out.println("At index 9:"+trimm.charAt(9));
		//split
		String sentence = "Java is powerful";
		String[] words = sentence.split(" ");

		for (String word : words) {
		    System.out.println(word);
		}
		//equality
		String t ="string";
		System.out.println("Equals(string,String):"+t.equalsIgnoreCase("String"));
		//starts?ends with
		System.out.println("Starts with 'Hello': " + trimm.startsWith("Hello"));
        System.out.println("Ends with '.': " + trimm.endsWith("."));
        //contains
        System.out.println("Contains 'is':"+ trimm.contains("is"));
        //Index of substring
        System.out.println("Index of 'Welcome': " + trimm.indexOf("Welcome"));

        //Last index of character
        System.out.println("Last index of 'o': " + trimm.lastIndexOf('o'));

        //isEmpty and isBlank
        String empty = "";
        String blank = "   ";
        System.out.println("Is empty: " + empty.isEmpty());
        System.out.println("Is blank: " + blank.isBlank());
	}

}
