package pro;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		System.out.println("check whether number is 3 digit number and multiple of 10");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n1 = sc.nextInt();
		
		if(n1 >=100 && n1<=999 && n1%10 ==0) {
			
				System.out.println("true");
			}
		
		else {
			System.out.println("false");
		}
	}

}
