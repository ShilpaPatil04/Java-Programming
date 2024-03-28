package com.arrayList;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(2);
		al.add(34);
		al.add(1);
		al.add(12);
		// al.add(null);
		System.out.println("Before Sorting");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

		System.out.println("After Sorting");
		Collections.sort(al);
		System.out.println(al);

		// ArrayList using for loop
		System.out.println("ArrayList using for loop");
		for (Integer i : al) {

			System.out.println(i);
		}

		// Iteration using Iterator Interface
		System.out.println("Iteration using Iterator Interface");
		Iterator<Integer> i1 = al.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		// Iteration using ListIterator Interface
		System.out.println("Iteration using ListIterator Interface in forword direction");
		ListIterator<Integer> lst = al.listIterator();
		while (lst.hasNext()) {
			System.out.println(lst.next());
			//System.out.println(lst.nextIndex());
		}

		// Iteration using ListIterator Interface
		System.out.println("Iteration using ListIterator Interface in backword direction");
		
		while (lst.hasPrevious()) {
			System.out.println(lst.previous());
			//System.out.println(lst.previousIndex());
		}

		System.out.println("Size: " + al.size());
		
		//Using lamda expression
		System.out.println("Using lamda expression");
		al.forEach(a->{
			System.out.println(a);
		});

	}

}
