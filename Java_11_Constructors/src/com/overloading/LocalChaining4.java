package com.overloading;

class Car4 {
	private String name;
	private int mileage;
	private int cost;

	// zero parameterized constructor
	public Car4() {
		
	}

	// parameterized constructor
	public Car4(String name, int mileage, int cost) {
		this.name = name;
		this.mileage = mileage;
		this.cost = cost;
	}
	// parameterized constructor
	public Car4(String name) {
		this();
		this.name=name;
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

public class LocalChaining4 {

	public static void main(String[] args) {
		

		Car4 c2 = new Car4("Ferari", 5, 808980800);
		System.out.println(c2.getName());
		System.out.println(c2.getMileage());
		System.out.println(c2.getCost());
		System.out.println();
		
		Car4 c3 = new Car4();
		System.out.println(c3.getName());
		System.out.println(c3.getMileage());
		System.out.println(c3.getCost());
	}

}
