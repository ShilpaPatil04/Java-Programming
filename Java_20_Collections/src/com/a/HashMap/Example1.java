package com.a.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		 
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
		hs.put(1, "A");
		hs.put(2, "B");
		hs.put(3, "C");
		hs.put(4, "D");
		hs.put(4, "D");
		hs.put(null, null);
		hs.put(5, null);
		hs.putIfAbsent(5, null);
		hs.putIfAbsent(10,"z");
		hs.remove(4);
		hs.remove(1, "A");
		//hs.remove(100);
		
		Set<Entry<Integer,String>>  s =hs.entrySet();
		for(Entry s1 : s) {
			System.out.println(s1.getKey()+" "+ s1.getValue());
		}
	}

}
