package com.overridingRules;

//The overriden method of child class must either maintain the same return type as the parent class method

class Parent1{
	public void fun() {
		System.out.println("Parent class method");
	}
}

class Child1 extends Parent1{
//  public int fun() {
//		System.out.println("Overriden method");
//	}
	//throw error
}

public class Rule2 {

	public static void main(String[] args) {
		
	}

}
