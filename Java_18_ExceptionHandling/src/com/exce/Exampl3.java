package com.exce;


import java.util.Scanner;

class test1{
	void fun1() {
		System.out.println("Connection 4 is established");
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter a");
			int a = sc.nextInt();
			System.out.println("Enter b");
			int b = sc.nextInt();
			int c=(a/b);
			System.out.println(c);
		System.out.println("Connection 4 is Terminated");
		
	}
}

class test2{
	void fun2() {
		System.out.println("Connection 3 is established");
		test1 d1 = new test1();
		try {
			d1.fun1();
		} catch (Exception e) {
			
			System.out.println("Handled in fun2");
		}
		System.out.println("Connection 3 is terminated");
	}
	
	}

class test3{
	void fun3() {
		System.out.println("Connection 2 is established");
		test2 d2 = new test2();
		d2.fun2();
		System.out.println("Connection 2 is terminated");
	}
	
	}

public class Exampl3 {

	public static void main(String[] args) {
		System.out.println("Connection 1 is established");
		test3 d3 = new test3();
		d3.fun3();
		System.out.println("Connection 1 is terminated");

	}

}






