package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Exampl4 {

	public static void main(String[] args) {
		HashMap<String,String> ex1 =new HashMap<String,String>(); 
		System.out.println(ex1);
		ex1.put("Name", "shilpa");
		ex1.put("Age", "25");
		ex1.put("Gender", "female");
		ex1.put("school", "GPUC");
		ex1.put("College", "AITM");
		System.out.println(ex1);
		
		//get() method
		System.out.println();
		System.out.print("using get() key -");
		System.out.println(ex1.get("Name"));
		System.out.println(ex1.get("lName"));
		
		//keySet() method
		System.out.println();
		System.out.println("Using KeySet()");
		Set<String> keys = ex1.keySet();
		for(String k1 :keys) {
			System.out.println(k1);
		}
		
		System.out.println();
	      Set<String> ky= ex1.keySet();
	      System.out.println(ky);
		
	      //values() method
		System.out.println();
		System.out.println("Using values() method");
		Collection <String> value =  ex1.values();
		for(String v1 :value) {
			System.out.println(v1);
		}
		
		System.out.println();
		Collection <String> value1 =  ex1.values();
		System.out.println(value1);
		
		//Getting all the keys and values using keySet()
		System.out.println();
		System.out.println("Getting all key and values");
		Set<String> k2=ex1.keySet();
		for(String pair:k2) {
			System.out.println(pair+" : "+ ex1.get(pair));
		}
		
		
		//entrySet()
		System.out.println();
		System.out.println("entrySet() method");
		Set<Entry<String,String>> entry = ex1.entrySet(); 
		   System.out.println(entry);
		   
		System.out.println();
		Set<Entry<String,String>> en1= ex1.entrySet();
		for( Entry<String,String> e1: en1) {
			System.out.println(e1);
		   }
		
		System.out.println();
		System.out.println("getKey() method");
		Set<Entry<String,String>> en2= ex1.entrySet();
		for(Entry<String,String> e2:en2) {
		System.out.println(e2.getKey());
		}
		
		System.out.println();
		System.out.println("getValue() method");
		Set<Entry<String,String>> val1 =ex1.entrySet();
		for(Entry<String,String> Va :val1) {
			System.out.println(Va.getValue());
		}
		
		System.out.println();
		System.out.println("setValue() method");
		Set<Entry<String,String>> sv=ex1.entrySet();
		for(Entry<String,String> setval :sv) {
			setval.setValue("XYZ");
		}
		System.out.println(ex1);
	}
}
	
