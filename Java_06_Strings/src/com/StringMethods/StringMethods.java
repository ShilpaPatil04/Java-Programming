package com.StringMethods;

public class StringMethods {

	public static void main(String[] args) {
		String s = "GeeksforGeeks";
		// or String s= new String ("GeeksforGeeks");

		// 1>length() method
		// Returns the number of characters in the String.
		System.out.println("------- 1>length() method -------");
		System.out.println("String length = " + s.length());
		System.out.println();

		// 2>charAt() method
		// Returns the character at ith index.
		System.out.println("------- 2>charAt() method -------");
		System.out.println("Character at 3rd position = " + s.charAt(3));
		System.out.println();

		// 3>substring() method
		// Return the substring from the ith index character
		// to end of string
		System.out.println("------- 3>substring() method -------");
		System.out.println("Substring " + s.substring(3));
		System.out.println();

		// Returns the substring from i to j-1 index.
		System.out.println("Substring  = " + s.substring(2, 5));
		System.out.println();

		// 4>concat() method
		// Concatenates string2 to the end of string1.
		System.out.println("------- 4>concat() method -------");
		String s1 = "Geeks";
		String s2 = "forGeeks";
		System.out.println("Concatenated string  = " + s1.concat(s2));
		System.out.println();

		// 5> indexOf() method
		// Returns the index within the string
		// of the first occurrence of the specified string.
		System.out.println("------- 5>indexOf() method -------");
		String s4 = "Learn Share Learn";
		System.out.println("Index of Share " + s4.indexOf("Share"));
		System.out.println();

		// Returns the index within the string of the
		// first occurrence of the specified string,
		// starting at the specified index.
		System.out.println("Index of a  = " + s4.indexOf('a', 3));
		System.out.println();

		// 6> equals() method
		// Checking equality of Strings --> here values are compared
		System.out.println("------- 6>equals() method -------");
		Boolean out = "Geeks".equals("geeks");
		System.out.println("Checking Equality  " + out);
		out = "Geeks".equals("Geeks");
		System.out.println("Checking Equality  " + out);
		System.out.println();

		// 7> equalsIgnoreCase() method
		System.out.println("------- 7>equalsIgnoreCase() method -------");
		out = "Geeks".equalsIgnoreCase("gEeks ");
		System.out.println("Checking Equality " + out);
		System.out.println();

		// 8> compareTo() method
		// If ASCII difference is zero then the two strings are similar
		System.out.println("------- 8> compareTo() method -------");
		int out1 = s1.compareTo(s2);
		System.out.println("the difference between ASCII value is=" + out1);
		System.out.println();

		// 9> toLowerCase() method
		// Converting cases
		System.out.println("------- 9> toLowerCase() method -------");
		String word1 = "GeeKyMe";
		System.out.println("Changing to lower Case " + word1.toLowerCase());
		System.out.println();

		// 10> toUpperCase() method
		// Converting cases
		System.out.println("------- 10> toUpperCase() method -------");
		String word2 = "GeekyME";
		System.out.println("Changing to UPPER Case " + word2.toUpperCase());
		System.out.println();

		// 11> trim() method
		// Trimming the word
		System.out.println("------- 11> trim() method -------");
		String word4 = " Learn Share Learn ";
		System.out.println("Trim the word " + word4.trim());
		System.out.println();

		// 12> replace() method
		// Replacing characters
		System.out.println("------- 12> replace() method -------");
		String str1 = "feeksforfeeks";
		System.out.println("Original String " + str1);
		String str2 = "feeksforfeeks".replace('f', 'g');
		System.out.println("Replaced f with g -> " + str2);
		System.out.println();

		// 13> contains() method
		// if it contains string it returns true else false
		System.out.println("------- 13> contains() method -------");
		String x = "Shilpa Patil";
		System.out.println(x.contains("Pa"));
		System.out.println();

		// 14> isEmpty() method -- It returns true if the length of the String is 0.
		System.out.println("------- 14> isEmpty() method -------");
		System.out.println(x.isEmpty()); // false
		String x1 = "";
		System.out.println(x1.isEmpty()); // true

	}

}
