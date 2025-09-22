package com.tns.exception;
import java.io.*;
public class Multi_catch {

	public static void main(String[] args) {
		try {
		  
		    FileReader file = new FileReader("hi.txt");
		    BufferedReader reader = new BufferedReader(file);
		    String line = reader.readLine();
		    reader.close();
		} catch (FileNotFoundException e) {
		    System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {
		    System.out.println("IO error: " + e.getMessage());
		}

	}

}
