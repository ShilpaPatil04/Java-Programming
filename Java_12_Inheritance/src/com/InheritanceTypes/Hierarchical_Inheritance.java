package com.InheritanceTypes;

//In Hierarchical Inheritance one parent class can have many child class, means many child class have single parent class

class A1{
	int x =10;
}

class B1 extends A1{
	int x=100;
}

class C1 extends A1{
	int x = 1000;
}

class D1 extends A1{
	int c =100;
	int x =222;
}

public class Hierarchical_Inheritance extends D1{

	public static void main(String[] args) {
		A1 a = new A1();
		System.out.println(a.x);
		
		Hierarchical_Inheritance h = new Hierarchical_Inheritance();
		System.out.println(h.x);

	}

}
