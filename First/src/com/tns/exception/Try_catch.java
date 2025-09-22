package com.tns.exception;

public class Try_catch {

	public static void main(String[] args) {
		String s= null;
		try {
			System.out.println(s.length());
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("This is catch block");
		}

	}

}
