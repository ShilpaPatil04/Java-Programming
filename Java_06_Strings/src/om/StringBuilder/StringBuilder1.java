package om.StringBuilder;

public class StringBuilder1 {
//StringBuilder is same as stringBuffer but StringBuilder is not thread safe
	public static void main(String[] args) {
		// Create a StringBuilder object
		// using StringBuilder() constructor
		StringBuilder str = new StringBuilder();

		str.append("GFG");

		// print string
		System.out.println("String = " + str.toString());

		// create a StringBuilder object
		// using StringBuilder(CharSequence) constructor
		StringBuilder str1 = new StringBuilder("AAAABBBCCCC");

		// print string
		System.out.println("String1 = " + str1);

		// create a StringBuilder object
		// using StringBuilder(capacity) constructor
		StringBuilder str2 = new StringBuilder(10);

		// print string
		System.out.println("String2 capacity = " + str2.capacity());

		// create a StringBuilder object
		// using StringBuilder(String) constructor
		StringBuilder str3 = new StringBuilder(str1.toString());

		// print string
		System.out.println("String3 = " + str3.toString());

		// reverse the string
		StringBuilder reverseStr = str.reverse();

		// print string
		System.out.println("Reverse String = " + reverseStr.toString());

		// Append ', '(44) to the String
		str.appendCodePoint(44);

		// Print the modified String
		System.out.println("Modified StringBuilder = " + str);

		// get capacity
		int capacity = str.capacity();

		// print the result
		System.out.println("StringBuilder = " + str);
		System.out.println("Capacity of StringBuilder = " + capacity);
	}

}
