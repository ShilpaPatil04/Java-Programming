package com.ternary;

public class TernaryOperator {

	public static void main(String[] args) {
	
		//example 1
		int a = 10;
		String result = (a%2 ==0 ? "even" : "odd");
		System.out.println("The number is: "+ result);
		
		
		//example 2
		 // variable declaration
        int n1 = 5, n2 = 10, max;
 
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
 
        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;
 
        // Print the largest number
        System.out.println("Maximum is = " + max);
        
        //example 3
     // variable declaration
        int nm1 = 5, nm2 = 10, res;
 
        System.out.println("First num: " + nm1);
        System.out.println("Second num: " + nm2);
 
        // Performing ternary operation
        res = (nm1 > nm2) ? (nm1 + nm2) : (nm1 - nm2);
 
        // Print the largest number
        System.out.println("Result = " + res);
        
        //example 4
        boolean condition = true;
        String result1 = (condition) ? "True" : "False";
       
        System.out.println(result1);
	}

}
