package pro;

import java.util.Scanner;

public class ArraySumEven{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		int[] ar = new int[n];
		
		for(int i=0; i< ar.length ;i++) {
			ar[i] = sc.nextInt();
		}
		int sum =0;
		
		for(int i=0; i< ar.length ;i++) {
			
			
			
			if(ar[i]%2 ==0 ) {
			
			sum = ar[i] +sum;
			
		}
		}
		System.out.println(sum);
	
	}

}
