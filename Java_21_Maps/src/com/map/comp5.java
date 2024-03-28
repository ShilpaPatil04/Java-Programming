package com.map;

import java.util.HashSet;
import java.util.TreeSet;

class Flight0 implements Comparable<Flight0>{
	private String departure;
	private String name;
	private float duration;
	private int price;
	
	public Flight0(){
		
	}

	public Flight0(String departure, String name, float duration, int price) {
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
	
	//Compare two flights
//	public int compareTo(Flight f2) {
//		String s1 =  this.departure;
//		String s2 = this.departure;
//		
//		return s1.compareTo(s2);
//	}
	
	public int compareTo1(Flight0 f2) {
		Integer p1 =  this.price;
		Integer p2 = f2.price;
		
		return p1.compareTo(p2);
	}



public class comp5 {

	public static void main(String[] args) {
		Flight0 f1 = new Flight0("21:00","indigo",2.5f, 5000);
		Flight0 f2 = new Flight0("23:00","goiod",5f, 7000);
		Flight0 f3 = new Flight0("04:30","spiject",1.5f, 2500);
		Flight0 f4 = new Flight0("16:00","vistara",3.5f, 6000);
		Flight0 f5 = new Flight0("21:30","airindia",4.5f, 5000);
		Flight0 f6 = new Flight0("09:00","indigo",4.0f, 6500);
		Flight0 f7 = new Flight0("11:00","spiject",3.5f, 9000);
		Flight0 f8 = new Flight0("13:00","goiod",2.0f, 8000);
		
		//ArrayList<Flight1> a1 =new ArrayList<Flight1>();
			TreeSet<Flight0> a1 =new TreeSet<Flight0>();
		//TreeSet<Flight1> a1 =new TreeSet<Flight1>();//ClassCastException
		a1.add(f1);
		a1.add(f2);
		a1.add(f3);
		a1.add(f4);
		a1.add(f5);
		a1.add(f6);
		a1.add(f7);
		a1.add(f8);
		
		
		for(Flight0 flt1 :a1) {
			System.out.println(flt1);
		}

	}
	}



//@Override
//public int compareTo(Flight0 o) {
//	// TODO Auto-generated method stub
//	return 0;
//}

@Override
public int compareTo(Flight0 o) {
	// TODO Auto-generated method stub
	return 0;
}

}
