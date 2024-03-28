package com.assignment;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		//Assignment operator are of two types
		//1> Simple Assignment
		/*
		  The Simple Assignment Operator is used with the “=” 
		  sign where the left side consists of the operand and the right side consists of a value
		 */
		// Declaring variables
        int num;
        String name;
 
        // Assigning values
        num = 10;
        name = "Shilpa";
 
        // Displaying the assigned values
        System.out.println("------- Simple Assignment -------");
        System.out.println("num is assigned: " + num);
        System.out.println("name is assigned: " + name);
        System.out.println();
        
        System.out.println("------- Compound Assignment --------");
        //2>Compound Assignment
        /*
         The Compound Operator is used where +,-,*, and / is used along with the = operator.
         */
        
        int x = 10;
         x +=10; //nothing but x=x+10
         System.out.println("x+= "+x); //20
         
         int x1 = 50;
         x1 -=10; //x1 = x1-10
         System.out.println("x1-= "+x1); //40
         
         int x2 = 55;
         x2 *=10; //x2=x2*10
         System.out.println("x2*= "+x2);// 550
         
         int x3 = 63;
         x3 /=10; //x3 = x3/10
         System.out.println("x3/= "+x3); //6
        
         int x4 = 33;
         x4 %=10; //x4 = x4%10
         System.out.println("x4%= "+x4); //3
	}

}
