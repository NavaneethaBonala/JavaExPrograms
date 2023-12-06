package inputoutputfilehandling;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * Example to copy the content from input file to output file.
 */
public class JavaIOTest {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("E:\\test.txt");
		
		int data = fis.read(); // Read a single byte
		
		FileOutputStream fos = new FileOutputStream("E:\\output.txt");
		
		while (data!=-1) {
			
			fos.write(data); // Write a single byte
			data=fis.read();
		}
		fos.close();
		fis.close();
		System.out.println("File copied successfully");
	}
}
