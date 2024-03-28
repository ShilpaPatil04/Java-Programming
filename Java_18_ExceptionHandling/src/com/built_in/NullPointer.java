package com.built_in;

//Java program to demonstrate NullPointerException 
public class NullPointer {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.charAt(0));
		} catch (NullPointerException ne) {
			System.out.println(ne.getMessage());
		}
	}

}
