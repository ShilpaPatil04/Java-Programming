package com.built_in;

//Java program to demonstrate FileNotFoundException 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void main(String[] args) {
		File f = new File("bc.txt");
		try {
			FileReader fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
