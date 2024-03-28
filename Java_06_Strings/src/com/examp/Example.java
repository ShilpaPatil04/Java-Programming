package com.examp;

public class Example {
	
	public static void main(String[] args) {
		
		String a = "shilpa";
		String b = "Shilpa";
		String c = new String("shilpa");
		String d = new  String("Shilpa");
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(c == d);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(c.equals(d));

	}

}
