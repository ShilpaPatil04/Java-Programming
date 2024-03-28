package pro;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l;
		int[] ar = new int[n];
		for(int i=0;i<  ar.length;i++) {
		
			ar[i] = sc.nextInt();
			//ar[i] = 10;
			//ar[i] = i+1;
			//ar[i] = i;
		}
		
		for(int i=ar.length-1;i>=0;i--) {
			
			System.out.print(ar[i]+" ");
		}
	}

}
