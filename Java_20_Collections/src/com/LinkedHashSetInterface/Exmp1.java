package com.LinkedHashSetInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exmp1 {

	public static void main(String[] args) {
		
		//creation of set
		Set<Integer> s = new LinkedHashSet<>();
		System.out.println(s.size());
		//adding elements
		s.add(122);
		s.add(2);
		s.add(3);
		s.add(2);
		s.add(100);
		s.add(99);
		s.add(670);
		System.out.println(s);//[1, 2, 3]  -->won't show error just ignores the duplicates
		
		s.add(null);  //-->won't show error just ignores the duplicates
		
		//whatever the collection class has methods by default available in Set interface
	    
		
		//iteration
		System.out.println("-------- Iteration --------");
		Iterator<Integer> i =s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(i);
		System.out.println(i.hashCode());
	}

}
