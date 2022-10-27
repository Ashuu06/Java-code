package corejava_initial.programs;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterExample {
	public static void main(String[] args)throws Exception 
	{
		
		PrintWriter writer = new PrintWriter(new File("C:\\Users\\Admin\\Desktop\\abc.txt"));
		writer.write("Hello Ashutosh Mishra here");                                                   
        writer.flush();  
        writer.close();  
        
     }  
   }


