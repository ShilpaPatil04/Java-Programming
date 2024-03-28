package com.Creation;

public class _1_CreatingString {
	//String is an object in java, present in java.lang.String package, The sequenece of characters which are enclosed with 
	//double quotes

	public static void main(String[] args) {
		
		//Creating an string using string literal
		System.out.println("-------- Creating an string using string literal ---------");
		String s1 = "Shilpa";
		System.out.println(s1);
		//Creating string using string literal are stored in string non-constant pool
		
		//creating an string using new keyword
		System.out.println("------- creating an string using new keyword ------");
		String s2 = new String("Patil");
		System.out.println(s2);
		// creating Java string by new keyword, this statement create two object i.e first the object is created in heap
        // memory area and second the object is created in String constant pool.
		
		//Creating an string using array of characters 
		System.out.println("------- Creating an string using array of characters  -------");
		char[] ch = {'s','h','i','l','p','a'};
		String s3 = new String(ch);
		System.out.println(s3);
		
		//Checking mutability
		System.out.println(" ------ Checking mutability --------");
		String s = "Shilpa";
		 // concat() method appends the string at the end
		s.concat("Patil");
		System.out.println(s);//shilpa --> the value does'nt get changed(because of immutability)
		
		s = s.concat("Patil");
		System.out.println(s);

	}
	
	//in java Strings are of two types mutable and immutable strings,
	//Immutable strings are created using String class in java, once they are created the value does'nt change

}
