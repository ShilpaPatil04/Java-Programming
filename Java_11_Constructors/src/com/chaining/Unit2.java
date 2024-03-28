package com.chaining;

class Exam1 {
	int x, y;

	Exam1() {
		super();
		x = 100;
		y = 200;
	}

	Exam1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Exam2 extends Exmp1 {
	int a, b;

	Exam2() {
		// calling the constructor of the same class
		this(9,99);
		a = 300;
		b = 400;
	}

	Exam2(int a, int b) {
		// calling super class constructor
		super();
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

public class Unit2 {

	public static void main(String[] args) {
//object with parameter
		Exam2 e2 = new Exam2();
		e2.display();
	
	}

}

