package pro;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		int[] ar = new int[n];
		for(int i =0; i< ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		for(int i =0; i< ar.length;i++) {
			if(ar[i] % 2 ==0) {
				ar[i] =0 ;
				System.out.print(ar[i]+" ");
			}else {
				System.out.print(ar[i]+" ");
			}
		}

	}

}
