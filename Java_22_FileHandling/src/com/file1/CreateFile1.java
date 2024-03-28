package com.file1;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

class CreateFile1 {
//Java Program to Create a new file using the File and BufferReader and InputSreamReader class 
	public void createFile() {
		String path = "";
		String name = "";
		
		//BufferedReader and InputStreamReader are mainly use to read data from user(key board)
		//These classes are located inside the “java.io” package.
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a file name");
			//Here “readLine()” method is used to take input and store it in name variable
			name = br.readLine();

			System.out.println("Enter a file path");
			path = br.readLine();

			String s = path + "" + name + ".txt";
			File f = new File(s);
			f.createNewFile();
			System.out.println("The file is exist: " + f.exists());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CreateFile1 file = new CreateFile1();
		file.createFile();

	}

}
