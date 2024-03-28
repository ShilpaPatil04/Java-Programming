package com.p1;

public class Customer2 {
	private int cid;
	private String cname;
	private int prize;

	// In java The constructor also acts as a specialized setter

	public Customer2(int cid, String cname, int prize) {
		//using this keyword we can solve variable shadowing problem
		//this means current instance of a class, this is called as local chaining
		this.cid = cid;
		this.cname = cname;
		this.prize = prize;
	}

	public static void main(String[] args) {
		Customer2 c = new Customer2(1, "Shilpa", 1023);
		System.out.println(c.cname + " " + c.cid + " " + c.prize);

	}
}
