package inputoutputfilehandling;

import java.io.*;
public class ObjectOutputStreamDemo {

	
	public static void main(String argv[]) throws Exception
        {
			FileOutputStream fout = new FileOutputStream("Test1_rec.txt");

			ObjectOutputStream out = new ObjectOutputStream(fout);

            Student s = new Student(100,"Sam","MCA",80.45f);
            Student s1 = new Student(101,"Ram","MBA",89.45f);
               
            out.writeObject(s);
            out.writeObject(s1);
            s.Show();
            s1.Show();
            
            System.out.println("Objects written to the file successfuly...");
            
            out.close();
            fout.close();
            
            
         }
	
	}
