 package com.map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Exampl1 {

	public static void main(String[] args) {
		// HashMap myDetails1 =new HashMap();
		 HashMap<String,String> myDetails =new HashMap<String,String>();
		 
		 System.out.println(myDetails);//{}
		 //INsersition of key value pairs in hashMap
         myDetails.put("FirstName", "Shilpa");
		 myDetails.put("LastName","Patil");
		 //myDetails.put("LastName","dear"); Duplicate keys are not allowed
		// myDetails.put("surname","dear");// duplicate values are allowed
		 myDetails.put("PhoneNumber","12352478645678");
		 myDetails.put("Password","shilpabpatil@123");
		 myDetails.put("DOB","04/01/2001");
		 myDetails.put("Gender", "Female");
		 System.out.println(myDetails);
		 
		 //1. get() method -get key and value names (only one time)
//		 System.out.println( "1.get() method -get key and value names");
//		 System.out.println(myDetails.get("FirstName"));
//		 System.out.println(myDetails.get("LastName"));
//		 System.out.println(myDetails.get("asadg"));//null
//		 
//		 
//		 //2.keySet() method gives only all the keys in the Map
//		 System.out.println(myDetails.keySet());
//		 
//		 Set<String> keys = myDetails.keySet();
//		 for (String key :keys){
//			 System.out.println(key);
//			 
//			
//		 }
//		 //3. Value()
//		 System.out.println(myDetails.values());
//		 
//		 Collection<String> values = myDetails.values();
//		 for(String value: values) {
//			 System.out.println(value);
//	 }
//		 
////		 //entrySet()
////		 Set<Entry<String,String>> entrys = myDetails.entrySet();
////		 for(Entry<String,String> entry : entrys) {
////			 System.out.println(entry);
////		 }
//		 
//		 //size()
//		 System.out.println();
//		 System.out.println("size() method");
//		 System.out.println(myDetails.size());//6
//			 
//		 //isEmpty()
//		 System.out.println();
//		 System.out.println("isEmpty() method");
//		 System.out.println(myDetails.isEmpty());//false
//		 
//		 //containsKey()
//		 System.out.println();
//		 System.out.println("containsKey()");
//		 System.out.println(myDetails.containsKey("Dob"));//false
//		 System.out.println(myDetails.containsKey("DOB"));//true
//		 
//		 //containsValue()
//		 System.out.println();
//		 System.out.println("containsKey()");
//		 System.out.println(myDetails.containsValue("Shilpa"));//true
//		 System.out.println(myDetails.containsValue("swati"));//false
//		 
//		 //remove(key)
//		 System.out.println();
//		 System.out.println("remove(key)");
//		 String vale = myDetails.remove("FirstName");
//		 System.out.println(vale);//Shilpa
//		 System.out.println(myDetails.remove("sdgy"));//null
//		 
//		 //remove(Key,value)
//		 System.out.println();
//		 System.out.println("remove(value)");
//		 boolean s= (myDetails.remove("FirstName", "Shilpa"));
//		
//		 System.out.println(myDetails);
//		 System.out.println(s);
//		 
		 System.out.println();
		 System.out.println("Check the if key is present don't insert the pair If it is not present then insert it ");
		 System.out.println(myDetails.containsKey("Country"));
		 myDetails.put("County", "India");
		 System.out.println(myDetails);
		 
//		 System.out.println();
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("Enter Key");
//		 String s1 = sc.next();
//		 System.out.println("Enter Value");
//		 String s2 = sc.next();
//		 
//		 if(myDetails.containsKey(s1) == false) {
//			 myDetails.put(s1, s2);
//		 }
//		 System.out.println(myDetails);
		 
		 System.out.println("putIfAbsent() method");
		 myDetails.putIfAbsent("Fiame", "Shpa");
         System.out.println(myDetails);		 
		 
         
         
	}

}
