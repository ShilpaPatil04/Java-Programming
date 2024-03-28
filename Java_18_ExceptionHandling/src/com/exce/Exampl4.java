package com.exce;

import java.util.Scanner;

class exmp{
	void fun() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection 2 is established");
		try {
			System.out.println("Enter a");
			int a = sc.nextInt();
			System.out.println("Enter b");
			int b = sc.nextInt();
			int c=(a/b);
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Exception handled in fun()");
			throw e;
		}
		finally {
		System.out.println("Connection 2 is terminated");
	}
	}
}





public class Exampl4 {

	public static void main(String[] args) {
		System.out.println("Connection 1 is established");
		try {
			exmp t1 = new exmp();
			t1.fun();
		} catch (Exception e) {
			System.out.println("Exception handled in main()");
		}
		System.out.println("Connection 1 is terminated");
	}

}
