package com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class compareBookNum implements Comparator<BusBook> {

	@Override
	public int compare(BusBook o1, BusBook o2) {
		Integer num1 = o1.getBookNum();
		Integer num2 = o2.getBookNum();
		return num1.compareTo(num2);
	}

}

class compareBookPlace implements Comparator<BusBook> {

	@Override
	public int compare(BusBook o1, BusBook o2) {
		String place1 = o1.getPlace();
		String place2 = o2.getPlace();
		return place1.compareTo(place2);
	}

}

class compareBookTime implements Comparator<BusBook> {

	@Override
	public int compare(BusBook o1, BusBook o2) {
		Float time1 = o1.getTime();
		Float time2 = o2.getTime();
		return time1.compareTo(time2);
	}

}

class compareBookPrice implements Comparator<BusBook> {

	@Override
	public int compare(BusBook o1, BusBook o2) {
		Integer price1 = o1.getPrice();
		Integer price2 = o2.getPrice();
		return price1.compareTo(price2);
	}

}

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

	@Override
	public int compareTo(BusBook o) {
		String i1 = this.place;
		String i2 = o.place;
		return i1.compareTo(i2);
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

		ArrayList<BusBook> arr = new ArrayList<>();
		arr.add(b1);
		arr.add(b2);
		arr.add(b3);
		arr.add(b4);
		arr.add(b5);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1. bookNum");
		System.out.println("2. Place");
		System.out.println("3. Time");
		System.out.println("4. Price");

		int choice = sc.nextInt();
		if (choice == 1) {
			Collections.sort(arr, new compareBookNum());
		} else if (choice == 2) {
			Collections.sort(arr, new compareBookPlace());
		} else if (choice == 3) {
			Collections.sort(arr, new compareBookPrice());
		} else if (choice == 4) {
			Collections.sort(arr, new compareBookTime());
		} else {
			System.out.println("Invalid");
		}

		for (BusBook b : arr) {
			System.out.println(b);
		}
	}

}
