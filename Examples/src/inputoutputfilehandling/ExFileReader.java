package inputoutputfilehandling;

import java.io.*;
public class ExFileReader {
	public static void main(String[] args) throws IOException
	{
	FileReader fr=new FileReader("d:\\anudiptext1.txt");
    BufferedReader br=new BufferedReader(fr);
    String str="";
    
    while( true )
    {      try
            {      str=br.readLine(); // read from file
                    if(str.equals(null))
                            break;
                    System.out.println(str);
            }
            catch(NullPointerException e)
            { break; }
    }
    br.close();
    fr.close();
}
}