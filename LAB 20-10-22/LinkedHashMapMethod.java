package corejava_initial.programs;

import java.util.*;  

public class LinkedHashMapMethod {

	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();        
	     map.put(101,"Ashutosh");    
	     map.put(102,"Vikas");    
	     map.put(103,"Gyanendra");    
	     System.out.println("Before invoking remove() method: "+map);     
	     map.remove(103);  
	     System.out.println("Updated list of elements: "+map);    
		
	}
}
