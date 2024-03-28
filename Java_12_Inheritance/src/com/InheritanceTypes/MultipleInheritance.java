package com.InheritanceTypes;

//Multiple inheritance means-> one child can extend multiple parent, it is not allowed in java because it 
//throws diamond shaped problem, so this can be solved by interfaces

class Z {

}

class X {

}

//this is multiple inheritance, throws an error
//class Y extends x,y{
//	
//}


//using interfaces we can solve the problem of multiple inheritance
interface One {
	public void print_geek();
}

interface Two {
	public void print_for();
}

interface Three extends One, Two {
	public void print_geek();
}

class Child implements Three {
	@Override
	public void print_geek() {
		System.out.println("Shilpa");
	}

	public void print_for() {
		System.out.println("Patil");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.print_geek();
		c.print_for();

	}

}
