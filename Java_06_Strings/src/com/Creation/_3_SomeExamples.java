package com.Creation;

import java.util.Arrays;

public class _3_SomeExamples {

	public static void main(String[] args) {
		// Construct String from subset of char array
		byte[] str = { 65, 97, 122, 90 };
		String s = new String(str);
		System.out.println(s); // AazZ

		String s1 = new String(str, 1, 3);
		System.out.println(s1);// azZ

		// Construct one string from another(converting characters to string)
		char characters[] = { 'G', 'f', 'g' };

		String firstString = new String(characters);
		String secondString = new String(firstString);

		System.out.println(firstString);// Gfg
		System.out.println(secondString);// Gfg

		/*
		 * Why string objects are immutable in Java? Because java uses the concept of
		 * string literal. Suppose there are 5 reference variables, all refer to one
		 * object “Sachin”. If one reference variable changes the value of the object,
		 * it will be affected by all the reference variables. That is why string
		 * objects are immutable in Java.
		 */

	}

}
