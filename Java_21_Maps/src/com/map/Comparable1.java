package com.map;

public class Comparable1 {

	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 = 20;
	    System.out.println(i1.compareTo(i2));
		
		Integer i11 = 100;
		Integer i22 = 20;
		System.out.println(i11.compareTo(i22));

		Integer i111 = 100;
		Integer i222 = 100;
		System.out.println(i111.compareTo(i222));

		
		System.out.println();
		String s1 = "ab";
		String s2 = "ac";
		System.out.println(s1.compareTo(s2));
		
		String s11 = "ac";
		String s22 = "ab";
		System.out.println(s11.compareTo(s22));
		
		String s111 = "ab";
		String s222 = "ab";
		System.out.println(s111.compareTo(s222));
	}

}
