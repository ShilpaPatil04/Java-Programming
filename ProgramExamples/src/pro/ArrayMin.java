package pro;

import java.util.Scanner;

public class ArrayMin {
	
	
	
	static int min(int[] ar) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<ar.length;i++) {
			if(ar[i]< min) {
				min = ar[i];
			}
	}
		return min;
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
		int res = min(ar);
		System.out.println("min= "+res);
	}

}


