package com.map;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

class Flight1{
	private String departure;
	private String name;
	private float duration;
	private int price;
	
	public Flight1(){
		
	}

	public Flight1(String departure, String name, float duration, int price) {
		super();
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
		return "[departure = "+ departure +", name = " + name +", duration = "+ duration
				+ ", price = "+ price + "]";
	}
	
}

public class POJOclassContinuation {

	public static void main(String[] args) {
		Flight1 f1 = new Flight1("21:00","indigo",2.5f, 5000);
		Flight1 f2 = new Flight1("23:00","goiod",5f, 7000);
		Flight1 f3 = new Flight1("04:30","spiject",1.5f, 2500);
		Flight1 f4 = new Flight1("16:00","vistara",3.5f, 6000);
		Flight1 f5 = new Flight1("21:30","airindia",4.5f, 5000);
		Flight1 f6 = new Flight1("09:00","indigo",4.0f, 6500);
		Flight1 f7 = new Flight1("11:00","spiject",3.5f, 9000);
		Flight1 f8 = new Flight1("13:00","goiod",2.0f, 8000);
		
		//ArrayList<Flight1> a1 =new ArrayList<Flight1>();
		HashSet<Flight1> a1 =new HashSet<Flight1>();
		//TreeSet<Flight1> a1 =new TreeSet<Flight1>();//ClassCastException
		a1.add(f1);
		a1.add(f2);
		a1.add(f3);
		a1.add(f4);
		a1.add(f5);
		a1.add(f6);
		a1.add(f7);
		a1.add(f8);
		
		
		for(Flight1 flt1 :a1) {
			System.out.println(flt1);
		}
	}

}
