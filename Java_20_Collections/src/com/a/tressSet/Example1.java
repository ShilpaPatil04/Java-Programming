package com.a.tressSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Example1 {

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
		
		Iterator<Integer>  itr =ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		//some methods of treeset
		System.out.println("//some methods of treeset//");
				System.out.println(ts.first());
                System.out.println(ts.last());
                
                System.out.println(ts.headSet(23)); //[1,12]
                System.out.println(ts.tailSet(23));//[23, 100, 1000]
                
                // Find the values just greater 
                // and smaller than the above string 
                System.out.println("Higher " + ts.higher(100)); //Higher 1000
                System.out.println("Lower " + ts.lower(100));  //Lower 23
                System.out.println("Lower " + ts.lower(0));  //null
                
                // Now removing the first element 
                // using pollFirst() method 
                ts.pollFirst(); 
                System.out.println(ts); //[12, 23, 100, 1000]
                
                // Removing the last element 
                // using pollLast() method 
                ts.pollLast();
                System.out.println(ts); //[12, 23, 100]
                
           
	}

}
