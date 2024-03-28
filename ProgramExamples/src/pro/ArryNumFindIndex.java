package pro;

import java.util.Scanner;

//write a program to find the element present in array or not
public class ArryNumFindIndex {

	static int find(int[] n, int m) {
		for(int i =n.length-1; i > 0  ; i--) {
			if(n[i] == m) {
				//System.out.println(i);
				return i;
			}	
	}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of an array:");
		int size = sc.nextInt();
		int[] n = new int[size];
		
		System.out.print("enter n number:");
		int m = sc.nextInt();
		
		for(int i =0; i< n.length ; i++) {
			n[i] = sc.nextInt();
		}
		
		find(n,m);
		//System.out.println(i);
       
	}

}
