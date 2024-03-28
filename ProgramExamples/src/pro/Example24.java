package pro;

import java.util.Scanner;

class printFactors{
	
	public static int factors(int n){
		for(int i=1; i<=n ;i++) {
			if(n%i ==0) {
				System.out.print(i+" ");
			}
		}
		return n;
	}
	
}


public class Example24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printFactors.factors(n);
		

	}

}
