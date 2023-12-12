package inputoutputfilehandling;
import java.io.*;

public class FileWrite1 {

	
	public static void main(String[] args) throws Exception{

		DataInputStream dis = new DataInputStream(System.in);
		FileWriter fw = new FileWriter("E:\\nita.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		String str = null;
		int size = 0;

		System.out.println("Enter the String to the file");

		while(true) {
			try {
				str = dis.readLine();
				if(str.equals("null"))
					break;
				size = str.length();
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
