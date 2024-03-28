package com.overloading;

class Printer {
	void print(int a) {
		System.out.println(a);
	}

	void print(float a) {
		System.out.println(a);
	}

	void print(char a) {
		System.out.println(a);
	}

	void print(boolean a) {
		System.out.println(a);
	}

	void print(short a) {
		System.out.println(a);
	}

	void print(int a, int b) {
		System.out.println(a + " " + b);
	}

	void print(float a, float b) {
		System.out.println(a + " " + b);
	}

	void print(int a, float b) {
		System.out.println(a + " " + b);
	}

	void print(double a, double b) {
		System.out.println(a + " " + b);
	}

	void print(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}

	void print(int a, char b, float c) {
		System.out.println(a + " " + b + " " + c);
	}
}

public class Method1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		char ch = 'z';
		float f = 34.5f;
		double d = 44.34;
		Printer p = new Printer();
		p.print(false);
		p.print(ch);
		p.print(a, b);
		p.print(a, b, c);
		p.print(a, ch, f);
	}

}
