package pro;

import java.util.Scanner;

public class ArrayMax {
	
	static int max(int[] ar) {
		//int max =0;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<ar.length;i++) {
			if( ar[i]> max) {
				max = ar[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		int[] ar = new int[n];
        
		for(int i=0; i<ar.length;i++) {
			ar[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<ar.length;i++) {
			System.out.print(ar[i]+" ");
			
		}
		System.out.println();
		int res = max(ar);
		System.out.println("max= "+res);
	}

}
