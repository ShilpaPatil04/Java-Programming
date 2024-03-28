package pro;

import java.util.Scanner;

public class Exapmle2 {

	public static void main(String[] args) {
		System.out.println("check whether number is divisible by 3 & 7 at the same time:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n1 = sc.nextInt();
		
		if(n1%3 ==0 && n1 %7 ==0) {
			System.out.println(n1 + " is divisible by both 3 & 7");
		}else {
			System.out.println(n1 + " not is divisible by both 3 & 7");
		}

	}

}
