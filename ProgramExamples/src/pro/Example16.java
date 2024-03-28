package pro;

import java.util.Scanner;

public class Example16 {

	public static void main(String[] args) {
		
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter number:");
			int n = sc.nextInt();
			
			for(int i=1;i<=n ; i++) { // or increment i =i+2
				if(i%2 !=0) {
				System.out.println(i);
			}
			}

	}

}
