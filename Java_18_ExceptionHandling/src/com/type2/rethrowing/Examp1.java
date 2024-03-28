package com.type2.rethrowing;

import java.util.Scanner;
//Example for rethrowing an exception using try catch finally throw throws
class Demo2 {

	void fun2() throws Exception {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Connection 2 establised");
			System.out.println("Enter a");
			int a = sc.nextInt();

			System.out.println("Enter b");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Handled exception in fun2()");
			throw e;
		} finally {
			System.out.println("Connection 2 terminated");
			sc.close();
		}

	}

}

public class Examp1 {

	public static void main(String[] args) {
		System.out.println("Connection 1 establised");
		try {
			Demo2 d2 = new Demo2();
			d2.fun2();
		} catch (Exception e) {
			System.out.println("Handled exception in main");
		}
		System.out.println("Connection 1 terminated");
	}

}
