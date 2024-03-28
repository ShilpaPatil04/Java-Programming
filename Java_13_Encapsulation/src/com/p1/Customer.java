package com.p1;

public class Customer {
	private int cid;
	private String cname;
	private int prize;
	
	//In java The constructor also acts as a specialized setter
	
	public Customer(int x, String y, int z) {
		cid =x;
		cname = y;
		prize = z;
	}

	public static void main(String[] args) {
		Customer c = new Customer(1,"Shilpa",1023);
		System.out.println(c.cname + " "+ c.cid+ " "+ c.prize);

	}

}
