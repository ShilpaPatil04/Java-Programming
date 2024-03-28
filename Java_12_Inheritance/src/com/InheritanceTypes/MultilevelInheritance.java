package com.InheritanceTypes;

//parent class
class A{
	int id=1;
}

//child class but parent to C
class B extends A{
	String name="Shilpa";
}

//child class but parent to D
class C extends B{
	int age =34;
}

//child class but parent to MultilevelInheritance
class D extends C{
	String area = "Konnur";
}

public class MultilevelInheritance extends D{
	int year = 2024;
    
	public static void main(String[] args) {
		MultilevelInheritance mul = new MultilevelInheritance();
		System.out.println(mul.id);
		System.out.println(mul.name);
		System.out.println(mul.age);
		System.out.println(mul.area);
		System.out.println(mul.year);
	}
}
