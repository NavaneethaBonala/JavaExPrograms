package inputoutputfilehandling;

import java.io.*;

public class WriteFromList
{
	public static void main(String[] args)
	{
		String[] list = {"one", "two", "three", "four"};
		try {
			File file = new File("data1.txt");
			// A stream that connects to the text file
			FileWriter filewriter = new FileWriter(file);
			// Connect the FileWriter to the BufferedWriter
			BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
			for (String s : list) {
				bufferedWriter.write(s + "\n");
			}
			bufferedWriter.close (); // Close the stream
			System.out.println("Written output successfully");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
