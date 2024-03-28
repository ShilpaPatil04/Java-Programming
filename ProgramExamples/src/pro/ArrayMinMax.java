package pro;

import java.util.Scanner;

public class ArrayMinMax {
	
	static int sum(int[] n) {
		int sum =0;
		for(int i =0; i< n.length ; i++) {
			sum = sum + n[i];
		}
		return sum;
	}
	
	static int min(int[] n) {
		int min =Integer.MAX_VALUE;
		for(int i =0; i< n.length ; i++) {
			if(n[i] < min)
			{
				min = n[i];
			}
		}
		return min;
	}
	
	static int max(int[] n) {
		int max = Integer.MIN_VALUE;
		for(int i =0; i< n.length ; i++) {
			if(n[i] > max)
			{
				max = n[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array:");
		int size = sc.nextInt();
		
		int[] n = new int[size];
		
		for(int i =0; i< n.length ; i++) {
			n[i] = sc.nextInt();
		}
			
		int a =sum(n);
		int b =min(n);
		int c =max(n);
		
		System.out.println("sum is: "+a);
		System.out.println("smallest number is: "+ (a-b));
		System.out.println("largest number is: "+ (a-c));
	}

}
