package pro;
import java.util.Scanner;

class fact{
	public static int NoOfFactorial(int n) {
		
		int count =0;
		for(int i=1; i<=n ; i++) {
			if(n%i == 0) {
				//System.out.print(i+" ");
				count++;
			}
		}
		
		//System.out.println("Count= "+count);
		return count;
	}
}

public class Example25 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		fact.NoOfFactorial(n);
		
	}

}
