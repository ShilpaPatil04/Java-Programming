package com.switchStatement;

public class Example2 {

	public static void main(String[] args) {
	  String name = "a";
	  switch(name) {
	  case "Shilpa" : System.out.println("I'm Shilpa");
	                 break;
	  case "shilpa" : System.out.println("I'm small shilpa");
                     break;  
	  case "Paru" : System.out.println("I'm paru");
                      break;
      default: System.out.println("Not a Girl");                
	  }

	}

}
