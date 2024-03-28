package com.chaining;

class Exmp1 {
	int x, y;

	Exmp1() {
		super();
		x = 100;
		y = 200;
	}

	Exmp1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Exmp2 extends Exmp1 {
	int a, b;

	Exmp2() {
		// calling super class constructor
		super();
		a = 300;
		b = 400;
	}

	Exmp2(int a, int b) {
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

public class Demo2 {

	public static void main(String[] args) {
//object with parameter
		Test2 t = new Test2(9, 99);
		t.display();
	}

}
