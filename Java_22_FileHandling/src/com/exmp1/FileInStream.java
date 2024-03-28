package com.exmp1;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInStream {
	public static void main(String[] args) throws IOException {

		// Attaching the file to FileInputStream
		FileInputStream fin = new FileInputStream("C:\\FileHandling\\CreateFile.txt");

		// Illustrating getChannel() method
		System.out.println(fin.getChannel()); //sun.nio.ch.FileChannelImpl@3feba861
 
		// Illustrating getFD() method
		System.out.println(fin.getFD()); //java.io.FileDescriptor@5b480cf9

		// Illustrating available method
		System.out.println("Number of remaining bytes:" + fin.available()); //Number of remaining bytes:17

		// Illustrating skip() method
		fin.skip(4); //Shilpa Patil.

		// Display message for better readability
		System.out.println("FileContents :");

		// Reading characters from FileInputStream
		// and write them
		int ch;

		// Holds true till there is data inside file
		while ((ch = fin.read()) != -1)
			System.out.print((char) ch);

		// Close the file connections
		// using close() method
		fin.close();
	}
}
