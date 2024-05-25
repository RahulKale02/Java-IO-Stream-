package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.Stream;

public class FileWriteOn_XML_File {



		public static void main(String[] args) {

			System.out.println("This is a simple file Writing program...\n");

			try {

				FileOutputStream file = new FileOutputStream("C:\\Users\\Admin\\Desktop\\rk.pdf");
				String IOStream ="Java FileOutputStream Class\r\n"
						+ "Java FileOutputStream is an output stream used for writing data to a file.\r\n"
						+ "\r\n"
						+ "If you have to write primitive values into a file, use FileOutputStream class. You can write byte-oriented as well as character-oriented data through FileOutputStream class. But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.";
				
				byte[] b = IOStream.getBytes();
				
				
				file.write(b);

								
			} catch (IOException e) {
				System.out.println(" Exception is  :" + e);
			}
			finally {
				
				System.out.println("Success.....");

		}

	}

	
}
