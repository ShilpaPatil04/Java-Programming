package com.comparable;

import java.util.TreeSet;

public class BusBook implements Comparable<BusBook> {

	private int bookNum;
	private String place;
	private float time;
	private int price;

	public BusBook(int bookNum, String place, float time, int price) {
		super();
		this.bookNum = bookNum;
		this.place = place;
		this.time = time;
		this.price = price;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

//	@Override
//	public int compareTo(BusBook o) {
//		Integer i1 = this.price;
//		Integer i2 = o.price;
//		return i1.compareTo(i2);
//	}

	@Override
	public int compareTo(BusBook o) {
		String s1 = this.place;
		String s2 = o.place;
		return s1.compareTo(s2);
	}

	@Override
	public String toString() {
		return "BusBook [bookNum=" + bookNum + ", place=" + place + ", time=" + time + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		BusBook b1 = new BusBook(1, "Konnur", 2.4f, 1345);
		BusBook b2 = new BusBook(206, "Gokak", 3.4f, 145);
		BusBook b3 = new BusBook(30, "Belagavi", 4.4f, 2345);
		BusBook b4 = new BusBook(43, "Mysure", 1.3f, 3675);
		BusBook b5 = new BusBook(5, "Pune", 2.0f, 3455);

		TreeSet<BusBook> arr = new TreeSet<>();
		arr.add(b1);
		arr.add(b2);
		arr.add(b3);
		arr.add(b4);
		arr.add(b5);

		for (BusBook a : arr) {
			System.out.println(a);
		}

	}

}
