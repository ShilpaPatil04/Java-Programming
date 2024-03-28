package com.PrivatePackage_1;


class A{
	private int b =100;
}

public class Example {
	//private variables and methods can be accessible within the class only
	private int a =10;

	public static void main(String[] args) {
		Example e = new Example();
		System.out.println(e.a);
		
		A z = new A();
		//System.out.println(z.A); --> It will through an error because b is private and it is in outside of a class

	}

}
