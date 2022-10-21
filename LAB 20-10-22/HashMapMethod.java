package corejava_initial.programs;

import java.util.*;  

public class HashMapMethod {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Ashutosh");    
	      map.put(101,"Vikas");    
	      map.put(102,"Rajnish");  
	      map.put(103, "Gyanendra");  
	      
	      System.out.println("Initial list of elements: "+map);  
	      //Insertion of value
	      map.put(104,"Ravi");  
	      
	      //key-based removal  
	      map.remove(100);  
	      System.out.println("Updated list of elements: "+map);
	      
	      //value-based removal  
	      map.remove(101);  
	      System.out.println("Updated list of elements: "+map);  
	      
	      //key-value pair based removal  
	      map.remove(102, "Rahul");  
	      System.out.println("Updated list of elements: "+map);  
		
	}
}
