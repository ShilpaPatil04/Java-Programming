package pro;

import java.util.Scanner;

public class ArrayLastSecondKvalue {

static int printDiff(int[] n, int k) {
		
	      int count = 0;
	      for(int i = n.length; i<0; i--) {
		  if(n[i] == k) {
			  count++;
		  }
		  if(count ==2) {
			  return n[i];
		  }
			
		}
	      return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array:");
		int size = sc.nextInt();
		int[] n = new int[size];
		
		System.out.println("Enter k value:");
		int k = sc.nextInt();
		
		for(int i =0; i< n.length ; i++) {
			n[i] = sc.nextInt();
		}
      
		printDiff(n,k);

	}

}
