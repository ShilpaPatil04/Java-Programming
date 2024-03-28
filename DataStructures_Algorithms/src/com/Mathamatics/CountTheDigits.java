package com.Mathamatics;

import java.util.Scanner;

public class CountTheDigits {
	
	public static int digitCount(int n) {
		
		int count =0;
		//In while loop we are checking the digit is exist of not
		while(n !=0) {
			if(n <=0) {
				n= -n; //here I'm converting negative number to positive number
			}
			count +=1; //here we are increasing value of a count -- if digit exists  
			n = n/10;  // Here we are removing last digit of a number
			
		}
		return count;
		
	}
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		
		int res = digitCount(n);
		System.out.println("The number of digits in a number: "+res);
}
}
