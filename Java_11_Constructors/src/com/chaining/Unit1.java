package com.chaining;

class Example1 {
	int x, y;

	Example1() {
		super();
		x = 100;
		y = 200;
	}

	Example1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Example2 extends Exmp1 {
	int a, b;

	Example2() {
		// calling super class constructor
		super();
		a = 300;
		b = 400;
	}

	Example2(int a, int b) {
		// calling super class constructor
		super(a,b);
		this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);

	}
}

public class Unit1 {

	public static void main(String[] args) {
//object with parameter
		Example2 e2 = new Example2(9,99);
		e2.display();
	
	}

}
