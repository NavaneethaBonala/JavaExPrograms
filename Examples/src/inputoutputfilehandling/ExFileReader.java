package inputoutputfilehandling;

import java.io.*;

public class ExFileReader {
	public static void main(String[] args) throws IOException
	{	// opens  the existing file to read
		FileReader fr=new FileReader("d:\\anudiptext.txt");
		//  it is used to read character by character
		BufferedReader br=new BufferedReader(fr);
		String str="";

		while( true )
		{     
			try
			{      
				str=br.readLine(); // reads from file
				if(str.equals(null))
					break;
				System.out.println(str);
			}
			catch(NullPointerException e)
			{ 
				break; 
			}
		}
		br.close();
		fr.close();
	}
}