/*Write a Java program that reads an input file from the file system and 
outputs the content of the file character by character. 
 Use FileReader.read() method to read characters from the file.
 At the end, print the total number of characters present in the file*/


package inputoutputfilehandling;
import java.io.*;

public class ReadInput {

	public static void main(String[] args)  throws Exception {
		
		DataInputStream dis = new DataInputStream(System.in);
		// to open file in writing mode
		FileWriter fw = new FileWriter("d:\\nita.txt");
		// to write data in the file 
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		
	}

}
