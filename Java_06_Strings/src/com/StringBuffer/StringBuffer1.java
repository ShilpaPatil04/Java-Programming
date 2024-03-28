package com.StringBuffer;

public class StringBuffer1 {
//StringBuffer class is used to create mutable (modifiable) strings. 
	// The StringBuffer class in Java is the same as the
	// String class except it is mutable i.e. it can be changed.
	public static void main(String[] args) {
		// Some methods of StringBuffer
		// 1>append() method
		System.out.println("1> append() method");
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Shilpa "); // now original string is changed
		System.out.println(sb); // Hello Shilpa
		System.out.println();

		// 2> insert() method
		System.out.println("2> insert() method");
		StringBuffer sb1 = new StringBuffer("Hello ");
		sb1.insert(0, "Shilpa "); // Now original string is changed
		System.out.println(sb1); // Shilpa Hello
		System.out.println();

		// 3> replace() method
		System.out.println("3> replace() method");
		StringBuffer sb2 = new StringBuffer("Hello ");
		sb2.replace(0, 2, "AAA"); // replaced first 3 char to A
		System.out.println(sb2);
		System.out.println(); // AAAllo

		// 4> delete() method
		System.out.println("4> delete() method");
		StringBuffer sb3 = new StringBuffer("Hello");
		sb3.delete(1, 3); // (included,excluded)
		System.out.println(sb3); // Hlo
		System.out.println();

		// 5> reverse() method
		System.out.println("5> reverse() method");
		StringBuffer sb4 = new StringBuffer("Hello");
		System.out.println(sb4.reverse()); // olleH
		System.out.println();

		// 6> capacity() method
		System.out.println("6> capacity() method");
		StringBuffer sb5 = new StringBuffer();
		System.out.println(sb5.capacity()); // default 16
		sb5.append("Hello");
		System.out.println(sb5.capacity()); // now 16
		sb5.append("java is my favourite language");
		System.out.println(sb5.capacity());//34
		// Now (16*2)+2=34 i.e (oldcapacity*2)+2
		System.out.println();

	}

}
