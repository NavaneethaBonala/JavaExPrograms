package inputoutputfilehandling;
import java.io.*;

public class FileWrite1 {

	
	public static void main(String[] args) throws Exception{
		//works same as scanner class
		DataInputStream dis = new DataInputStream(System.in);
		// to create and open the file in writing mode
		FileWriter fw = new FileWriter("E:\\nita.txt");
		//to write the data in to the file(create obj)
		BufferedWriter bw = new BufferedWriter(fw);

		String str = null;
		int size = 0;

		System.out.println("Enter the String to the file");

		while(true) {
			try {
				str = dis.readLine();
				// if user types the null 
				//it terminates
				if(str.equals("null"))
					break;
				// first assign the length of the string
				size = str.length();
				// write(String s, int off, int len)
				/*s String to be written
				 * off Offset from which to start reading characters
				 * len Number of characters to be written
				 */
				bw.write(str,0,size);
				bw.write("\n");
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		bw.close();
		fw.close();
	}

}
