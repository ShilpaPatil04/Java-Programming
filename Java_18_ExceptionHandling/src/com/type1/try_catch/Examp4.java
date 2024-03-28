package com.type1.try_catch;

import java.util.Scanner;
//Examples for handling methods in method calls
class Demo1 {
	void fun1() {
		System.out.println("Connection 4 established");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a");
	int a = sc.nextInt();

	System.out.println("Enter b");
	int b = sc.nextInt();
	int c = a/b;
	System.out.println(c);
	System.out.println("Connection 4 termiated");
}
}
class Demo2{
	void fun2() {
		System.out.println("Connection 3 established");
		Demo1 d1 = new Demo1();
		try{
			d1.fun1();
		}catch(Exception e) {
			System.out.println("Exception handled in fun2()");
		}
		System.out.println("Connection 3 termiated");
	}
}

class Demo3 {
	void fun3() {
		System.out.println("Connection 2 established");
        Demo2 d2 = new Demo2();
        d2.fun2();
        System.out.println("Connection 2 termiated");
	}
}

public class Examp4 {

	public static void main(String[] args) {
		System.out.println("Connection 1 established");
		Demo3 d3 = new Demo3();
		d3.fun3();
		System.out.println("Connection 1 terminated");
	}

}
