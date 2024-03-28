package com.exce;

import java.util.Scanner;

class Demo1{
	void fun1() {
		System.out.println("Connection 4 is established");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a");
			int a = sc.nextInt();
			System.out.println("Enter b");
			int b = sc.nextInt();
			int c=(a/b);
			System.out.println(c);
		} catch (Exception e) {
			
			
			System.out.println("Some exception occurs ");
		}
		System.out.println("Connection 4 is Terminated");
		
	}
}

class Demo2{
	void fun2() {
		System.out.println("Connection 3 is established");
		Demo1 d1 = new Demo1();
		d1.fun1();
		System.out.println("Connection 3 is terminated");
	}
	
	}

class Demo3{
	void fun3() {
		System.out.println("Connection 2 is established");
		Demo2 d2 = new Demo2();
		d2.fun2();
		System.out.println("Connection 2 is terminated");
	}
	
	}

public class exampl2 {

	public static void main(String[] args) {
		System.out.println("Connection 1 is established");
		Demo3 d3 = new Demo3();
		d3.fun3();
		System.out.println("Connection 1 is terminated");

	}

}
