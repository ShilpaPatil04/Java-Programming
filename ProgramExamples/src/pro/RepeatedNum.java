package pro;

public class RepeatedNum {

	public static void main(String[] args) {
		long n = 121212123632l;
		int check = 8;
		int count= 0;
		
		while(n >0) {
		long rem = n%10;//2
		 n = n/10;//12345
		if(rem == check) {
			count++;
		}
		}
        System.out.println("Numbers of 1: "+count);
	}

}
