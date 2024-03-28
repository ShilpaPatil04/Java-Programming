package pro;

import java.util.Scanner;

public class Example1 {
//check whether number is even or not
	public static void main(String[] args) {
		System.out.println("check whether number is even or not:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" is even");
		}else {
			System.out.println(n+" is odd");
		}
		int n1 = sc.nextInt();
		if(n1%3 ==0) {
			System.out.println("Divisible by 3");
		}else {
			System.out.println("Not Divisible by 3");
		}

	}

}
