package com.map;

import java.util.HashMap;
import java.util.Set;

public class Exampl3 {

	public static void main(String[] args) {
		//Creating MyData1 HashMap
		HashMap<String,String> MyData1 = new HashMap<String,String>();
		
		//Adding Enrtys to MyData1
        MyData1.put("Virat", "RCB");
        MyData1.put("Hardhik", "GT");
        MyData1.put("Dhoni", "CSK");
        MyData1.put("Rohit", "MI");
        MyData1.put("Kishan", "PANJ");
        
       // System.out.println(MyData1);
        System.out.println();
        
      //Creating MyData2 HashMap
        HashMap<String,String> MyData2 = new HashMap<String,String>();
        
      //Adding Enrtys to MyData2
        MyData2.put("Rahul", "LSG");
        MyData2.put("Warner", "SRH");
        MyData2.put("Pant", "DC");
        
      Set<String> keys= MyData2.keySet();
      for(String k1:keys) {
    	  String value = MyData1.get(k1);
    	  MyData1.put(k1, value);
      }
      System.out.println(MyData1);
       // System.out.println(MyData2);
      
      //EasyWay to write above code
      System.out.println();
       MyData1.putAll(MyData1);
       System.out.println(MyData1);
      
       //replace() method
       System.out.println();
       System.out.println("replace() method");
       MyData1.replace("Dhoni", "ASD");
       System.out.println(MyData1);
       
       System.out.println();
       System.out.println("replace() method");
       MyData1.replace("Dhoni", "ASD", "CSK");
       System.out.println(MyData1);
       
       //clear() method
       System.out.println();
       MyData1.clear();
       System.out.println(MyData1);
	}

}
