package inputoutputfilehandling;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * Example to copy the content from input file to output file.
 */
public class JavaIOTest {
	public static void main(String[] args) throws IOException {
		
		// FileInputStream read file from system
		FileInputStream fis = new FileInputStream("D:\\anudiptext.txt");
		
		// read data from file in the form of byte and returns integer value
		int data = fis.read(); // Read a single byte
		
		// FileOutputStream is used to copy the content from FileInputStream read txt file to another file
		FileOutputStream fos = new FileOutputStream("E:\\output.txt");
		
		// here while loop checks if data has content if it is true
		while (data!=-1) {
			
			// writes the data from fis into fos 
			fos.write(data); // Write a single byte
			
			//data=fis.read();
		}
		fos.close();
		fis.close();
		System.out.println("File copied successfully");
	}
}
