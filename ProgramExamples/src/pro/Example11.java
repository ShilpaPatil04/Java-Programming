package pro;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String string  = sc.next();
//		char ch = string.charAt(0);
//		System.out.println(ch);
//		
//		System.out.println((int)ch);
		
		for(int i =0; i< string.length();i++) {
			char c = string.charAt(i);
			System.out.println(c +": "+(int)c);
		}

	}

}
