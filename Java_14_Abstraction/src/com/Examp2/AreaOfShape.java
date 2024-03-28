package com.Examp2;

import java.util.Scanner;

abstract class Shape {
	float area;
//abstract method
	abstract void acceptInput();

	abstract void calcArea();
//concrete method
	public void displayArea() {
		System.out.println("The area is: "+area);
	}

}
//Square class
class Square extends Shape {
	private int side;

	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of a square");
		side = sc.nextInt();

	}

	@Override
	void calcArea() {
		area = side * side;

	}

}

//Rectangle class
class Rectangle extends Shape {
	private float length;
	private float breadth;

	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		length = sc.nextFloat();
		System.out.println("Enter the breadth: ");
		breadth = sc.nextFloat();

	}

	@Override
	void calcArea() {
		area = (int) (length * breadth);

	}

}
//circle class
class Circle extends Shape {
	private float radius;

	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		radius = sc.nextFloat();

	}

	@Override
	void calcArea() {
		area = (float) (3.142 * radius * radius);

	}

}

class Geometry {

	public void perimeter(Shape shape) {
		shape.acceptInput();
		shape.calcArea();
		shape.displayArea();
	}

}

//main class
public class AreaOfShape {

	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();

		Geometry g = new Geometry();
		g.perimeter(s);
		g.perimeter(r);
		g.perimeter(c);

	}

}
