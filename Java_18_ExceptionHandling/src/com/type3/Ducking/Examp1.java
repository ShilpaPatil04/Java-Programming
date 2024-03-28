package com.type3.Ducking;

import java.util.Scanner;

class Demo1 {
	void fun() throws Exception {
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
			System.out.println("Handled in fun()");
		} finally {
			System.out.println("Connection 2 terminated");
		}

	}
}

public class Examp1 {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		System.out.println("Connection 1 establised");
		try {
			d.fun();
		} catch (Exception e) {
			System.out.println("Handled in main method");
		}
		System.out.println("Connection 1 terminated");
	}

}
