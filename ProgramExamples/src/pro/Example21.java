package pro;

import java.util.Scanner;

public class Example21 {

	public static void main(String[] args) {
		
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter number:");
			int n = sc.nextInt();
			int count =0;
			
			for(int i=1; count<n ; i++) {
				if(i%2 ==0 || i%3 ==0)
				System.out.println(i);
				count++;
			}
	}

}
