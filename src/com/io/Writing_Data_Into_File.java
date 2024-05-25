
package com.io;

import java.io.*;

public class Writing_Data_Into_File {

	public static void main(String[] args) {

		System.out.println("This is Simple Program for wirting  text paragraph on txtFile ");

		try {

			FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\rk.txt");
			String java = "The input stream is the superclass of the I/O  operation and is used \nfor reading inputs of a user through a keyboard, file, etc.\n If you have to write primitive values into a file, use FileOutputStream class.\n You can write byte-oriented as well as character-oriented data through FileOutputStream class.\n But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream. ";
			byte[] b = java.getBytes();
			fos.write(b);

			fos.close();
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println("\nSuccess.....");

		} catch (IOException e) {
			System.out.println("Get Error : " + e);
		}

	}

}
