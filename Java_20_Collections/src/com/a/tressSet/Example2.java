package com.a.tressSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Example2 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(12);
		ts.add(100);
		ts.add(23);
		ts.add(1);
		ts.add(1000);
		//duplicates are not allowed
		//ts.add(1);
		//Null insersion is not allowed
		//ts.add(null);
		
		Iterator<Integer>  itr =ts.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}

}
