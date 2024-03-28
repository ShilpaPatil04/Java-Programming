package com.type1.try_catch;

import java.util.Scanner;

//Example for normal termination
//here user not provided denominator as zero

public class Examp1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		
		System.out.println("Enter b");
		int b = sc.nextInt();
		
		int c = a/b;
		System.out.println("Normal Termination");
		System.out.println("c= "+c);

	}

}
