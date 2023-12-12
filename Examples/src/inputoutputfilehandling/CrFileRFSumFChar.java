/*Write a Java program that reads an input file from the file system and 
outputs the content of the file character by character. 
 Use FileReader.read() method to read characters from the file.
 At the end, print the total number of characters present in the file*/


package inputoutputfilehandling;
import java.io.*;

public class CrFileRFSumFChar {

	public static void main(String[] args)  throws Exception {
		
		DataInputStream dis = new DataInputStream(System.in);
		// to open file in writing mode
		FileWriter fw = new FileWriter("d:\\nita.txt");
		// to write data in the file 
		BufferedWriter bw = new BufferedWriter(fw);
		// initiallly string is in null
		String str =  null ;
		System.out.println("Enter the String to the file ");
		// now add the characters to the string
		while(true)
		{
			try {
				str = dis.readLine();
				if(str.equals("null"))
					break;
				
				bw.write(str);
				bw.write("\n");
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
		bw.close();
		fw.close();
		
		FileInputStream fis = new FileInputStream("d:\\nita.txt");
		int totalcharacter=0;
		
		int character;
		
		while((character=fis.read())!= -1)
		{
			totalcharacter++;
		}
		System.out.println("Total number of characters : "+ totalcharacter);	
		fis.close();
	}

}
