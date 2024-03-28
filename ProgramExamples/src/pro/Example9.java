package pro;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		System.out.println("check whether number is multiple of 15 print 'BTM' multiple of 5 print 'Academy' multiple of 3 print 'TAP' ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n1 = sc.nextInt();
		
		if(n1%15==0) {
			System.out.println("BTM");
		}else if(n1%5==0) {
			System.out.println("Academy");
		}else if(n1%3 ==0) {
			System.out.println("Tap");
		}else {
			System.out.println("Invalid");
		}

	}

}
