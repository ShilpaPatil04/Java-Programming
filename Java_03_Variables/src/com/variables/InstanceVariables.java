package com.variables;

public class InstanceVariables {

	public static void main(String[] args) {
		
		//Instance variables --> within a block of a code, we have to initialize it
		for(int i=0; i<10;i++) {
			//we should initialize an instance variables, or else it will throw an error
			int sum=0;
			sum = sum + i;
			System.out.println(sum);
		}
		//System.out.println(sum);
		//here we will get an error bcz scope of a instance variables with in a block of a code,outside of the code is not allowed
	}

}
