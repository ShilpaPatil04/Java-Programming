package com.map;


import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Exampl2 {

	public static void main(String[] args) {
		TreeMap<String,String> flights = new TreeMap<String,String>();
		
		flights.put("20:00", "india");
		flights.put("10:00", "jammu");
		flights.put("05:00", "kerala");
		flights.put("17:30", "surat");
		flights.put("09:00", "indo");
		flights.put("04:80", "belagavi");
		flights.put("24:00", "konnur");
		
		
//		System.out.println(flights.firstKey());
//		System.out.println(flights.firstEntry());
//		System.out.println(flights.lastKey());
//		System.out.println(flights.lastEntry());
//		System.out.println(flights.ceilingKey("04:80"));
		
		
		//keySet()
//	Set<Entry<String,String>> entrys = flights.entrySet();
//	
//		for(Entry<String, String> entry : entrys) {
//			System.out.println(entry);
//		}
		
		
		
		//descendingKeySet()
//       Set<String> keys = flights.descendingKeySet();       
//       for(String key:keys) {
//    	   System.out.println(key);
//      }
		
		
//		
//		//descendingKeyMap()
//		 Map<String,String> flights2=flights.descendingMap();
//		Set<Entry<String,String>> set = flights2.entrySet();
//		for(Entry<String,String> s:set) {
//			System.out.println(s);
//	}
//		
		
//		//HeadMap() - toKey
//		Map<String,String> Flights3=flights.headMap("09:00",true);//true means included, false means excluded
//		Set<Entry<String,String>> entry1 =Flights3.entrySet();
//		for(Entry<String,String> e1: entry1) {
//			System.out.println(e1);
//		}
		
//		//tailMap() - fromKey
//		Map<String,String> flights4 =flights.tailMap("20:00",true);
//		Set<Entry<String,String>> entry2 =flights4.entrySet();
//		for(Entry<String,String> e2: entry2) {
//			System.out.println(e2);
//}
		
		//subMap(fromKey,toKey)
//		Map<String,String> flt5 =flights.subMap("09:00", "20:00");//(Inclusive,Exclusive)
//		Set<Entry<String,String>> enrt2 = flt5.entrySet();
//		for(Entry<String,String> ent1 :enrt2) {
//			System.out.println(ent1);
//		}
//		
//		Map<String,String> flt6 =flights.subMap("09:00",false, "20:00",true);//(Inclusive,Exclusive)
//		Set<Entry<String,String>> enrt3 = flt6.entrySet();
//		for(Entry<String,String> ent2 :enrt3) {
//			System.out.println(ent2);
//		}
		
		//remove()
		//pollFirstEntry()
		
//		Set<Entry<String,String>> enrt4 = flights.entrySet();
//		for(Entry<String,String> ent: enrt4) {
//			System.out.println(ent);
//		}
//		
//		System.out.println();
//		System.out.println(flights.pollFirstEntry());
//		
//		System.out.println();
//		Entry<String,String> enrt5 = flights.pollFirstEntry();
//		System.out.println(enrt5);
//		
//		System.out.println();
//		Set<Entry<String,String>> enrt6 = flights.entrySet();
//		for(Entry<String,String> ent6 :enrt6) {
//			System.out.println(ent6);
//		}
//		
		
		//pollLastEntry()
		System.out.println();
		System.out.println(flights.pollLastEntry());
	
		System.out.println();
		Set<Entry<String,String>> enrt7 = flights.entrySet();
		for(Entry<String,String> en5:enrt7) {
			System.out.println(en5);
		}
	}

}
