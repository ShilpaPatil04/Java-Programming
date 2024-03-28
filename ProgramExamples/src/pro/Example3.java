package pro;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("check whether number is ends with 0 or not:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n1 = sc.nextInt();
		
		if(n1%10 == 0) {
			//(n1%7==0) ends with 7
			System.out.println("Number ends with zero");
		}else {
			System.out.println("Number not ends with zero");
		}

	}

}
