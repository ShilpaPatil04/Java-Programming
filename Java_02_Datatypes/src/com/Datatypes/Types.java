package com.Datatypes;

import java.util.Arrays;

public class Types {

	public static void main(String[] args) {
		//In java there are 2 types of data types,Primitive Data type or Intrinsic or built-in data type
		// and Non-Primitive Data type or derived  or reference data type
		
		 //Primitive Data type or Intrinsic or built-in data type
		        // byte type
		        byte b = 20;
		        System.out.println("b= " + b);
		 
		        // short type
		        short s = 20;
		        System.out.println("s= " + s);
		 
		        // int type
		        int i = 20;
		        System.out.println("i= " + i);
		 
		        // long type
		        long l = 20;
		        System.out.println("l= " + l);
		        
		        // float type
		        float f = 20.25f;
		        System.out.println("f= " + f);
		 
		        // double type
		        double d = 20.25;
		        System.out.println("d= " + d);
		        
		        //char data type --> 0 to 65,535
		        char ch = 'S';
		        System.out.println(ch);
		         
		        char ch2 = '&';
		        System.out.println(ch2);
		         
		        char ch3 = '$';
		        System.out.println(ch3);
		        
		        //boolean data types
		        boolean t = true;
		        System.out.println(t);
		  
		        boolean fal = false;
		        System.out.println(fal);
		        
		        
		        System.out.println("PRIMITIVE DATA TYPES\n");
		        int x = 10;
		        int y = x;
		        System.out.print("Initially: ");
		        System.out.println("x = " + x + ", y = " + y);
		 
		        // Here the change in the value of y
		        // will not affect the value of x
		        y = 30;
		 
		        System.out.print("After changing y to 30: ");
		        System.out.println("x = " + x + ", y = " + y);
		        System.out.println(
		            "**Only value of y is affected here "
		            + "because of Primitive Data Type\n");
		 
		        System.out.println("REFERENCE DATA TYPES\n");
		        int[] c = { 10, 20, 30, 40 };
		 
		        // Here complete reference of c is copied to d
		        // and both point to same memory in Heap
		        int[] d1 = c;
		 
		        System.out.println("Initially");
		        System.out.println("Array c: "
		                           + Arrays.toString(c));
		        System.out.println("Array d: "
		                           + Arrays.toString(d1));
		 
		        // Modifying the value at
		        // index 1 to 50 in array d
		        System.out.println("\nModifying the value at "
		                           + "index 1 to 50 in array d\n");
		        d1[1] = 50;
		 
		        System.out.println("After modification");
		        System.out.println("Array c: "
		                           + Arrays.toString(c));
		        System.out.println("Array d: "
		                           + Arrays.toString(d1));
		        System.out.println(
		            "**Here value of c[1] is also affected "
		            + "because of Reference Data Type\n");
		        
		        
		        int[] arr = {100,200,300,400};
		        int[] arr1 = arr;
		        System.out.println(arr+" ->"+Arrays.toString(arr));
		        System.out.println(arr1+" ->"+Arrays.toString(arr1));
		        
		       arr[1] = 1;
		       arr[2] = 2;
		       System.out.println(arr+" ->"+Arrays.toString(arr));
		        System.out.println(arr1+" ->"+Arrays.toString(arr1));
		        
		    
	}

}
