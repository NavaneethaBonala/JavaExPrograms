package inputoutputfilehandling;

import java.io.*;
public class ExFileWriter {
	
	 @SuppressWarnings("deprecation")
	public static void main(String[] sun) throws IOException
     {
			//to read input from keyboard
             DataInputStream dis=new DataInputStream(System.in);
             //only to open the file in write mode           
             FileWriter fw = new FileWriter("d:\\anudiptext.txt",true);
             //it helps  write data to the file
             BufferedWriter br=new BufferedWriter(fw);

             String str=null;
             int size;
             System.out.println("Enter the string to write");

             while( true )
            {
              try
              {
                       str=dis.readLine(); //read fromkeyborad
                       if(str.equals("null"))
                          break;
                          size=str.length();
                          br.write(str,0,size);  //write to file
                          br.write("\n");
//                          System.out.println(br);
                      }
                    catch(Exception e)
                  {
                     System.out.println(e);
                     }
             }

             br.close();
             fw.close();
     }

}