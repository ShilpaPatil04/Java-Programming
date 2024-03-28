package com.overloading;

class Car {
	private String name;
	private int mileage;
	private int cost;

	// zero parameterized constructor
	public Car() {
		name = "BMW";
		mileage = 10;
		cost = 700000;
	}

	// parameterized constructor
	public Car(String name, int mileage, int cost) {
		super();
		this.name = name;
		this.mileage = mileage;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}

public class SimpleExample {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.getName());
		System.out.println(c1.getMileage());
		System.out.println(c1.getCost());
		System.out.println();

		Car c2 = new Car("Ferari", 5, 808980800);
		System.out.println(c2.getName());
		System.out.println(c2.getMileage());
		System.out.println(c2.getCost());
	}

}
