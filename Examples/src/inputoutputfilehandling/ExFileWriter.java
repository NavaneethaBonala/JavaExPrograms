package inputoutputfilehandling;

import java.io.*;
public class ExFileWriter {

	public static void main(String[] sun) throws IOException
	{
		//to read input from keyboard
		DataInputStream dis=new DataInputStream(System.in);
		//only to open the file in write mode           
		FileWriter fw = new FileWriter("d:\\shiva.txt",true);
		//it helps  write data to the file
		BufferedWriter br=new BufferedWriter(fw);

		String str=null;
		int size;
		System.out.println("Enter the string to write");

		while( true )
		{
			try
			{
				// readLine() is used to read lines of text from the file
				//read fromkeyborad
				str=dis.readLine(); 
				// now in "str" we have the read data , str.equals execute break when user type null 
				if(str.equals("null"))
					break;
				// if str.equals is not null then it executes further
				//length of the string
				size=str.length();
				System.out.println(size);
				
				//Use the write() or writeLine() method of the BufferedWriter class to write
				//data to the file.
				//br.write(str, startIndex, size);
				br.write(str,0,size);  //write to file
				br.write("\n");
				System.out.println(br);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		// close the bufferedWriter
		br.close();
		// close the FileWriter
		fw.close();
	}

}