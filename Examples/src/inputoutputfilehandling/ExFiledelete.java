package inputoutputfilehandling;
import java.io.*;

public class ExFiledelete {
	
	public static void main(String[] args) {
		File f = new File("d:\\sort.java");

        if (f.exists())
        {
                if (f.delete())
                        System.out.println("Dir/File Deleted ...");
                else
                        System.out.println("Unable to Delete ...");
                }
        else
                System.out.println("Dir. not found ....");
        }

}
