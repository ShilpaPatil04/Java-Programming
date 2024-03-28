package com.built_in;
// Java program to demonstrate StringIndexOutOfBoundsException 
public class StringIndexOutOfBound {

	public static void main(String[] args) {
		String s = "Shilpa";
		try {
		System.out.println(s.charAt(10));
		}catch(StringIndexOutOfBoundsException se) {
			System.out.println(se.getMessage());
		}
	}

}
