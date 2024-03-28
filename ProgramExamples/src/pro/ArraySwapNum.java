package pro;

import java.util.Scanner;

public class ArraySwapNum {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l;
		int[] ar = new int[n];
		
		for(int i=0;i<  ar.length-1;i++) {
		
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Before Swaping");
		for(int i=0; i <ar.length-1; i++) {
			
			System.out.print(ar[i]+" ");
		}
		//swapping logic 
		for(int i=0; i < ar.length-1; i=i+2) {
			int temp = ar[i];
			ar[i] = ar[i+1];
			ar[i+1] = temp;
		}

		System.out.println();
		System.out.println("After Swaping");
		for(int i=0; i < ar.length-1; i++) {
			
			System.out.print(ar[i]+" ");
		}
	}

}
