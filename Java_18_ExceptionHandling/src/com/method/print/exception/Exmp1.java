package com.method.print.exception;

import java.util.Arrays;

//Methods to print the Exception information:
public class Exmp1 {

	public static void main(String[] args) {

		int[] ar = new int[5];
		try {
			ar[0] = 1;
			ar[0] = 1;
			ar[0] = 1;
			ar[0] = 1;
			ar[0] = 1;
			ar[6] = 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			//3. getMessage() 
			//The getMessage() method prints only the description of the exception.
			System.out.println(e.getMessage());
			
			
			//2. toString() 
			//The toString() method prints exception information in the format of the Name of the exception: 
			//description of the exception.
			System.out.println(e.toString());
			
			
			// 3. printStackTrace()
			// This method prints exception information in the format of the Name of the
			// exception:
			// description of the exception, stack trace.
			e.printStackTrace();

		}
		System.out.println(Arrays.toString(ar));

	}

}
