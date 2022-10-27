package corejava_initial.programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Emp_Details {
	
	public static void main(String[] args) {
		
        String emp_details= "Eid:101 , Ename:Ashutosh Mishra , Salary:2500000";
        
        try {
        	
        	   File myObj = new File("C:\\Users\\Admin\\Desktop\\emps.txt");
               if (myObj.createNewFile()) 
               {
                 System.out.println("File created: " + myObj.getName());
               } 
               else 
               {
                  System.out.println("File already exists.");
               }
               
               FileWriter fWriter = new FileWriter("C:\\Users\\Admin\\Desktop\\emps.txt");
               fWriter.write(emp_details);
               System.out.println(emp_details);
               fWriter.close();
               System.out.println("File is created successfully with the given content.");
            }
            catch (IOException e) 
            {
              System.out.print(e.getMessage());
            }
        }
    }
	


