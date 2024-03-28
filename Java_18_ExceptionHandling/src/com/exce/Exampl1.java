package com.exce;

import java.util.Scanner;

public class Exampl1 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a");
		
		try {
			int a = Sc.nextInt();
			System.out.println("Enter b");
			int b = Sc.nextInt();
			System.out.println(a/b);
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("Some exception occurs ");
		}
		System.out.println("Connection Terminated");

	}

}
