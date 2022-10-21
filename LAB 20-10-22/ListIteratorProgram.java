package corejava_initial.programs;

import java.util.*;

public class ListIteratorProgram {

	public static void main(String[] args) {
		
		// list of names
        List<String> names = new LinkedList<>();
        names.add("Student Name:Ashutosh Mishra");
        names.add("Roll No: 08");
        names.add("College: KMA College");
        names.add("Location : Kalyan");
 
        // Getting ListIterator
        ListIterator<String> listIterator = names.listIterator();
        
        
        // Traversing elements
        System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()) 
        {
           System.out.println(listIterator.next());
        }  
        
         System.out.println("\n");
         
         // Traversing elements, the iterator is at the end at this point
         System.out.println("Backward Direction Iteration:");
         while (listIterator.hasPrevious()) 
         {
            System.out.println(listIterator.previous());
         }
	}
}
