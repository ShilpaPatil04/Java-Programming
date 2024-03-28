package com.map;

import java.util.HashMap;
import java.util.TreeSet;

class Flight2 implements Comparable<Flight2> {
	private String departure;
	private String name;
	private float duration;
	private int price;

	public Flight2() {

	}

	public Flight2(String departure, String name, float duration, int price) {
		this.departure = departure;
		this.name = name;
		this.duration = duration;
		this.price = price;

	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "[departure = " + departure + ", name = " + name + ", duration = " + duration + ", price = " + price
				+ "]";
	}

	public int comapreTo(Flight2 f2) {
		Integer i1 = this.price;
		Integer i2 = f2.price;

		return i1.compareTo(i2);
	}

	@Override
	public int compareTo(Flight2 o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

//	@Override
//	public int compareTo(Flight2 o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}

public class POJOclassContinue1 {

	public static void main(String[] args) {

		Flight2 f11 = new Flight2("21:00", "indigo", 2.5f, 5000);
		Flight2 f22 = new Flight2("23:00", "goiod", 5f, 7000);
		Flight2 f33 = new Flight2("04:30", "spiject", 1.5f, 2500);
		Flight2 f44 = new Flight2("16:00", "vistara", 3.5f, 6000);
		Flight2 f55 = new Flight2("21:30", "airindia", 4.5f, 5000);
		Flight2 f66 = new Flight2("09:00", "indigo", 4.0f, 6500);
		Flight2 f77 = new Flight2("11:00", "spiject", 3.5f, 9000);
		Flight2 f88 = new Flight2("13:00", "goiod", 2.0f, 8000);

		TreeSet<Flight2> a11 = new TreeSet<Flight2>();
		a11.add(f11);
		a11.add(f22);
		a11.add(f33);
		a11.add(f44);
		a11.add(f55);
		a11.add(f66);
		a11.add(f77);
		a11.add(f88);

		for (Flight2 flt1 : a11) {
			System.out.println(flt1);
		}

	}

}
