package inputoutputfilehandling;

import java.io.*;

public class ReadingObject {
	public static void main(String argv[]) throws Exception
    {
		FileInputStream fin = new FileInputStream("Test1_rec.txt");

		ObjectInputStream in = new ObjectInputStream(fin);

        Student s1 = (Student) in.readObject();
        s1.Show();
        Student s2 = (Student) in.readObject();
        s2.Show();
        
        in.close();
        fin.close();
     }
}
