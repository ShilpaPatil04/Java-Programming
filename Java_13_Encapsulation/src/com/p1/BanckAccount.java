package com.p1;
//Encapsulation is the process of binding data types and methods together
//Encapsulation can be achieved by making data member as private and giving the control access by public getter and setter methods
public class BanckAccount {
	private int bal;
	
	
	public void setBal(int x) {
		if(x>0) {
			bal =x;
		}
		
	}
	
	public int getBal() {
		return bal;
	}

	public static void main(String[] args) {
		BanckAccount c1 = new BanckAccount();
		c1.setBal(100);
		System.out.println(c1.getBal());

	}

}
