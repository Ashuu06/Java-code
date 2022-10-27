package corejava_initial.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {
	
	public static void main(String[] args) throws IOException
    {
		
		File myObj = new File("C:\\Users\\Admin\\Desktop\\demo.txt");
        if (myObj.createNewFile()) 
        {
          System.out.println("File created: " + myObj.getName());
        } 
        else 
        {
           System.out.println("File already exists.");
        }
        
        
        String str = "File Handling in Java using FileWriter and FileReader";
               
        FileWriter fw=new FileWriter("C:\\Users\\Admin\\Desktop\\demo.txt");
 
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
 
        System.out.println("Writing successful");
        fw.close();
        
        
        int ch;
        FileReader fr=null;
        try
        {
            fr = new FileReader("C:\\Users\\Admin\\Desktop\\demo.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
 
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);
        
        fr.close();
    }
}
