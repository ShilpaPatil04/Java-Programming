package com.conversion;

public class StringToStringBufferBuilder {

	public static void main(String[] args) {
		// Custom input string
		String str = "Geeks";

		// Converting String object to StringBuffer object
		// by
		// creating object of StringBuffer class
		StringBuffer sbr = new StringBuffer(str);

		// Reversing the string
		sbr.reverse();

		// Printing the reversed string
		System.out.println(sbr);

		// Converting String object to StringBuilder object
		StringBuilder sbl = new StringBuilder(str);

		// Adding it to string using append() method
		sbl.append("ForGeeks");

		// Print and display the above appended string
		System.out.println(sbl);

	}

}
