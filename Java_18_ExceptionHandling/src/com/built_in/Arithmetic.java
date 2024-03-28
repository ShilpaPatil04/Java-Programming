package com.built_in;

//Java program to demonstrate ArithmeticException 
public class Arithmetic {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("Exception resolved");
		}

	}

}
