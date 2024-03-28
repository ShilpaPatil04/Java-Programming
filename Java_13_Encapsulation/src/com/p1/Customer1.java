package com.p1;

public class Customer1 {

	private int cid;
	private String cname;
	private int prize;

	// In java The constructor also acts as a specialized setter

	public Customer1(int cid, String cname, int prize) {
		cid = cid;
		cname = cname;
		prize = prize;
	}

	public static void main(String[] args) {
		Customer1 c = new Customer1(1, "Shilpa", 1023);
		System.out.println(c.cname + " " + c.cid + " " + c.prize);

	}
	//here we will get default values because we are calling instance variables from the constructor, so that we will get default values
  //This is called as variable shadowing this can be solved by this keyword
}
