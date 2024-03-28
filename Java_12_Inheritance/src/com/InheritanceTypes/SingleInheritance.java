package com.InheritanceTypes;

/*
  In single inheritance, subclasses inherit the features of one superclass.  
  It is single level inheritance
 */

class Single{
	int z =1000;
}

public class SingleInheritance extends Single{

	public static void main(String[] args) {
		
     SingleInheritance s = new SingleInheritance();
     System.out.println(s.z);
	}

}
