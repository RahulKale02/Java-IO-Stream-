package com.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.crypto.Data;

public class Read_data_form_file {

	public static void main(String[] args) {

		System.out.println("This is a simple file reading program...\n");

		try {

			FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\rk.txt");
			DataInputStream fis = new DataInputStream(file);
			int Data;
				while((Data = fis.read()) !=-1)
				{
					System.out.print((char)Data);
					
				}
			
			
			
			
		} catch (IOException e) {
			System.out.println(" Exception is  :" + e);
		}

	}

}
