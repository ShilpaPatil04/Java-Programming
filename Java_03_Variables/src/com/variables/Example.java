package com.variables;

public class Example {
	// Static variables
	static String county = "India";

	// Instance variables
	int a;
	String str;

	public static void main(String[] args) {

		Example e = new Example();
		// calling instance variables using object reference
		System.out.println("calling instance variables using object reference");
		System.out.println(e.a);
		e.str = "Hello";
		System.out.println(e.str);

		// calling static variables using class name
		System.out.println("calling static variables using class name");
		System.out.println(Example.county);

		if (e.a == 0) {
			// local variables
			int b = 10;
			e.a = b;
			System.out.println("Calling local variables");
			System.out.println(e.a);
		}

	}
}
