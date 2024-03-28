package com.map;

class Flight{
	private String departure;
	private String name;
	private float duration;
	private int prize;
	
	public Flight() {
		
	}
	
	public Flight(String departure, String name, float duration, int prize) {
		super();
		this.departure = departure;
		this.name = name;
		this.duration = duration;
		this.prize = prize;
	
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

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}
}

public class PojoClass {

	public static void main(String[] args) {
		Flight f1 =new Flight("21:00","indigo",2.5f,2000);
		System.out.println(f1);
	}

}
