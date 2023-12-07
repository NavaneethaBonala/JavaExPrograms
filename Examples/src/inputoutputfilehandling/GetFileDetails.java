/*
 * runs in cmd
 */

package inputoutputfilehandling;
import java.io.*;

class GetFileDetails {

	public static void main(String args[]) {

		File f =  new File(args[0]); // to get file/directory name from command promt
		if(f.exists())
		{
			System.out.println("Name : "+ f.getName());
			System.out.println("Name : "+ f.getParent());
			System.out.println("Name : "+ f.length());
			System.out.println("Name : "+ f.isFile());
			System.out.println("Name : "+ f.canRead());
			System.out.println("Name : "+ f.canWrite());			
			
			System.out.println("Name : "+ f.getAbsolutePath());
			System.out.println("Name : "+ f.lastModified());
		}
		else
		{System.out.println("Invalid Path.....");
		}
	}
}


