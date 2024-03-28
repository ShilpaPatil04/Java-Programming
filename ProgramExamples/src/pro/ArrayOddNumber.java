package pro;

public class ArrayOddNumber {

	public static void main(String[] args) {
		int[] n = {1,2,3,5,4,6,9};
		
		for(int i =0; i< n.length; i++) {
			if(n[i] %2 != 0) {
				System.out.print(n[i]+" ");
			}
		}

	}

}
