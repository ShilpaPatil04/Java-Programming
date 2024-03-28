package com.overloading;

class Rectangle{
	float area(int l, float b) {
		return l*b;
	}
	double area(double l, double b) {
		return l*b;
	}
}
public class Method2 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		int a=10,  b=20;
		System.out.println(r.area(a, b)); //automatic type promotion takes place
	}

}
