package pro;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int sum =0;
		
		int[] ar = new int[n];
		
		for(int i=0; i< ar.length ;i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i=0; i< ar.length ;i++) {
			
			sum = ar[i] +sum;
			
		}
		System.out.println(sum);
	}

}
