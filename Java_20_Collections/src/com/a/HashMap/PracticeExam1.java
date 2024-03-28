package com.a.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class PracticeExam1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hs = new LinkedHashMap<Integer,String>();
		hs.put(100, "A");
		hs.put(2, "B");
		hs.put(33, "C");
		hs.put(426, "D");
		hs.put(5, "E");
		System.out.println(hs);
		
	
		Set<Entry<Integer,String>>S =hs.entrySet();
		for(Entry a :S) {
			System.out.println(a);
			System.out.println(a.getKey()+": "+a.getValue());
			
		}
		
		for(Entry a :S) {
			System.out.println(a.getKey());
			System.out.println(a.getValue());
		}
		System.out.println(hs.remove(1));
		for(Entry a :S) {
			System.out.println(a.getKey());
		}
		
		System.out.println(hs.containsKey(100));
		
		
			int k =6;
			String v ="w";
			if(hs.containsKey(k)== false) {
				hs.put(k,v );
			
		}
		
		for(Entry a :S) {
			System.out.println(a.getKey());
			System.out.println(a.getValue());
		}
		
		System.out.println(hs.putIfAbsent(10, v));
		
	    for(Entry e : S) {
	    	System.out.print("["+e.getKey()+": "+e.getValue()+" ]");
	    }
	}

}
