package com.a.tressSet;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PracticeExam1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> ts = new TreeMap<Integer,String>();
		ts.put(1, "a");
		ts.put(2, "b");
		ts.put(3, "c");
		ts.put(4, "d");
		System.out.println(ts);
		
		Map<Integer,String> d =ts.descendingMap();
		Set<Entry<Integer,String>> t = d.entrySet();
        for(Entry e : t) {
        	System.out.println(e);
        }
	}

}
