package pro;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		//Absolute value
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		//Using ternary operator
		System.out.println(n>=0? n : -n);
		
		if(n >= 0) {
			System.out.println(n);
		}else {
			System.out.println(-n);
		}
		
	}

}
