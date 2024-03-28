package com.Creation;

public class _2_Conversion {
//Conversion of String from non-constant pool to constant pool
	public static void main(String[] args) {
		//here s1 & s2 will store in non constant pool with difference reference,
		//so that using new keyword the reference are not equal
		String s1 = new String("Shilpa");
		String s2 = new String("Shilpa");
		if(s1==s2) {
			System.out.println("Refference are equal");
		}else {
			System.out.println("Refference are not equal");
		}
		
		//here I'm trying to change String from non-constant pool to constant pool, 
		//we know that String with new keyword stores in non constant pool
		//here using intern() method I'm changing string from non-constant pool to constant pool. So that I got an output as
		//Reference are equal, because in constant pool Reference are equal, pointing to same object reference
		String conversion1 = s1.intern();
		String conversion2 = s2.intern();
		//System.out.println(conversion);
		if( conversion1 == conversion2) {
			System.out.println("Reference are equal");
		}else {
			System.out.println("Reference are not equal");
		}

	}

}
