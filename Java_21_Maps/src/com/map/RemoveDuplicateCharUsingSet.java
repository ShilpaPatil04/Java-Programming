package com.map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
//import java.util.Set;

public class RemoveDuplicateCharUsingSet {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.next();
		
		//HashSet<Character>  s1= new HashSet<Character>();
		
		LinkedHashSet<Character>  s1= new LinkedHashSet<Character>();
		for(int i = 0;i< s.length();i++) {
			
			s1.add(s.charAt(i));
		}
		System.out.println(s1);
	}

}
