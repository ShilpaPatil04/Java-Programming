package com.file1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

//How to Create a new file in Java using FileOutputStream class?
public class CreatFile2 {
	String name = "";
	String path = "";

	public void createFile() {
		try {
			// Creating BufferClass Object
			//To create a new file using java language, “FileOutputStream” class is used here and “BufferedReader” &  
			//“InputStreamReader” both are used to take file name and path from the user as input. 
			//These classes are located inside of “java.io” package.
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the file name");
			// Asking file name from User
			name = rd.readLine();

			System.out.println("Enter the file path");
			// Asking file path from User
			path = rd.readLine();

			// Creating Object of FileOutputStream Class
			//The object of FileOutputStream class is necessary to call methods provided in its class.
			FileOutputStream fo = new FileOutputStream(path + "" + name + ".txt");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CreatFile2 f = new CreatFile2();
		f.createFile();

	}

}
