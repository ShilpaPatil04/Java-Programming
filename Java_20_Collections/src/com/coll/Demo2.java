package com.coll;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		//1. AddAll() method
		System.out.println("1. AddAll() method");
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(20);
		al.add(300);
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		//insersion with position
		System.out.println("insersion with position");
		al.add(2,100);
		System.out.println(al);
		
		ArrayList a2 = new ArrayList();
		a2.add(100);
		a2.add(200);
		a2.add(300);
		a2.add(400);
		System.out.println(a2);
		al.addAll(a2);
		System.out.println(al);
		
		al.addAll(2,a2);
		System.out.println(al);
		
		
		//2. get method()
		System.out.println("2. get method()");
        System.out.println(al.get(2));
        
        //3. sublist() method
        System.out.println("3. sublist() method");
        System.out.println(al.subList(4,8));//[included, excluded]
        
        //4. indexOf() method
        System.out.println("4. indexOf() method");
        System.out.println(al.indexOf(400));
        
        //5. lastIndexOf()method
        System.out.println("5. lastIndexOf()method");
        System.out.println(al.lastIndexOf(100));
        
        //6 remove()method
        System.out.println("6 remove()method");
        System.out.println(al.remove(5));
        
        //7. remove()method
        System.out.println("7 remove()method");
        System.out.println(al.remove(new Integer (100)));
        System.out.println(al);
       
        //8. remove all() method
        System.out.println("8. remove all() method");
        System.out.println(al.removeAll(a2));
        System.out.println(al);
        System.out.println(a2);
        
        //9. clear() method
        al.clear();
        System.out.println(al);
        a2.remove(2);
        System.out.println(a2);
	}

}
