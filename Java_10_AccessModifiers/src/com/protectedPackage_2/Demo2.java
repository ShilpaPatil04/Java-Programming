package com.protectedPackage_2;

import com.protectedPackage_1.Demo1;

public class Demo2 extends Demo1{
	protected String name = "Shilpa";
	
	protected  void outsidePackage() {
		System.out.println("This is from outside of a package");
	}
	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		//taking method and variable values from different packages but from sub packages
		d2.outsidePackage();
		System.out.println(d2.z);
		System.out.println(d2.name);
	}

}
