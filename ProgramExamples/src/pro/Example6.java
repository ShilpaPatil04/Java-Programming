package pro;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		System.out.println("check whether number is 2 digit number or not");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n1 = sc.nextInt();
		
		if(n1 >=10 && n1<=99) {
			//(n1 >=100 & n1<=999
			System.out.println(n1+" is 2 digit number");
		}else {
			System.out.println(n1+" is not 2 digit number");
		}

	}

}
