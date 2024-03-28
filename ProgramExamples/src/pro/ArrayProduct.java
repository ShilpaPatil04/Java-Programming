package pro;

import java.util.Scanner;

public class ArrayProduct {

	static int product(int[] ar) {
		int pro=1;
		for(int i=0;i< ar.length;i++) {
			pro = pro *ar[i];
		}
		return pro;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		int[] ar = new int[n];
		
         for(int i=0;i< ar.length;i++) {
			ar[i] = sc.nextInt();
		}
         int res = product(ar);
         System.out.println(res);
	}

}
