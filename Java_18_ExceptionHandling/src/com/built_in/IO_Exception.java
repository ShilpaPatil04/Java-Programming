package com.built_in;

import java.util.Scanner;

public class IO_Exception {
	public static void main(String[] args) 
	    { 
	  
	        // Create a new scanner with the specified String 
	        // Object 
	        Scanner scan = new Scanner("Hello Geek!"); 
	  
	        // Print the line 
	        System.out.println("" + scan.nextLine()); 
	  
	        // Check if there is an IO exception 
	        System.out.println("Exception Output: " + scan.ioException()); 
	  
	        scan.close();
}
}
