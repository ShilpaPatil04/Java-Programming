package com.enu;

enum Month{
	JAN,FEB,MAR,APR,MAY,JUNE,JULY,AUG,SEP,OCT,NOV,DEC;
	
	//constructor
	Month(){
		System.out.println("Constructor called for "+ this);
		//this is not public or protected only default or private
}
}


public class program {

	public static void main(String[] args) {
		Month a =Month.AUG;
//		System.out.println(a);
//		System.out.println(a.ordinal());
//		
//		Month[] mon = Month.values();
//		for(Month m : mon) {
//			System.out.println(m);
//		}
//		
//		Month[] mon1 =Month.values();
//		for(Month m1 : mon1) {
//			System.out.println(m1+ " "+ m1.ordinal());
//		}

	}

}
