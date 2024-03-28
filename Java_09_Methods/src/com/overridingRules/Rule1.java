package com.overridingRules;

//The overriden method of child class must either maintain the same access modifier as the parent class method or 
//provide greater access however it can never reduce

class Parent{
	public void fun() {
		System.out.println("Parent class method");
	}
}

class Child extends Parent{
//	void fun() {
//		System.out.println("Overriden method");
//	}
	//throw error
}

public class Rule1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
