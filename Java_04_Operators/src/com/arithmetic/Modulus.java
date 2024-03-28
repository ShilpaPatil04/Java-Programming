package com.arithmetic;

public class Modulus {

	public static void main(String[] args) {
		//Modulus(%)
		// initializing variables
        int num1 = 5, num2 = 2, mod = 0, mod1=0;
 
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
 
        // Remaindering num1 and num2
        mod = num1 % num2; //5%2 =1
        mod1 = num2 % num1; //2%5 =2
        System.out.println("Remainder = " + mod); //1
        System.out.println("Remainder = " + mod1);//5
	}

}
