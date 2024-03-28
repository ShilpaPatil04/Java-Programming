package com.map;

import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Exampl6_TMexamp1 {

	public static void main(String[] args) {
		TreeMap<String,String> flights=new TreeMap<String,String>();
		flights.put("21:00","Indigo");
		flights.put("23:30","Godir");
		flights.put("04:30","Spejiect");
		flights.put("16:00","Vistara");
		flights.put("21:30","Annindia");
		flights.put("09:00","Indigo");
		flights.put("11:00","Spejiect");
		flights.put("13:00","Godir");
		System.out.println(flights);
		
		//Using Entry
				System.out.println();
				Set<Entry<String,String>> Key_Value1 = flights.entrySet();
				for(Entry<String,String> KV1:Key_Value1) {
					System.out.println(KV1);
				}
				
	    System.out.println();
        System.out.println(flights.firstKey());//04:30
        
        System.out.println(flights.firstEntry());//04:30=Spejiect
        
        System.out.println(flights.lastKey());//23:30
        
	    System.out.println(flights.lastEntry());//23:30=Godir
	    
	    System.out.println(flights.ceilingKey("05:00"));//09:00    very next one
	    System.out.println(flights.ceilingKey("13:00"));//13:00
	    
	    System.out.println(flights.ceilingEntry("10:06"));//11:00=Spejiect
	    
	    System.out.println(flights.floorKey("11:30"));//11:00   Before the specified key
	    System.out.println(flights.floorEntry("11:30"));//11:00=Spejiect
	    
	    System.out.println(flights.floorKey("04:30"));//04:30
	    
	    System.out.println();
	    System.out.println(flights.ceilingKey("09:00"));//09:00
	    System.out.println(flights.higherKey("09:00"));//11:00
	    System.out.println(flights.higherEntry("09:00"));
	    
	    System.out.println();
	    System.out.println(flights.floorKey("09:00"));//09:00
	    System.out.println(flights.lowerKey("09:00"));//04:30
	    System.out.println(flights.lowerKey("05:00"));//04:30
	    System.out.println(flights.lowerEntry("09:00"));//04:30=Spejiect
	}

}
