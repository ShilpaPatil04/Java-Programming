package pro;

import java.util.Scanner;

class UniqueElements{
	
	static int elemnts(int[] ar) {
		 int count = 1;
		for(int i = 0; i< ar.length-1; i++) {
			if(ar[i] != ar[i+1]) {
				count++;
			}
		}
		 return count;
	}


public class ArrayUniqueElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
	    int ar[] = new int[size];
		for(int i = 0; i< ar.length; i++) {
		    ar[i] = sc.nextInt();
		}
      
		 
		 System.out.println(elemnts(ar));
		
	}
 }
}
