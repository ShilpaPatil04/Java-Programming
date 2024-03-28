package com.doWhileLoop;

public class Example1 {
//in do while loop first statement will executes then condition will check
	public static void main(String[] args) {
		int n =1;
		System.out.println("Do while loop started");
		do {
			System.out.print(n+" ");
			n++;
		}while(n<0);
		System.out.println();
		System.out.println("Do while loop ended");
	}

}
