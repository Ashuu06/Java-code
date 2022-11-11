package collection_programs;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		NavigableMap<Integer, String> nmap = new TreeMap<Integer, String>();
		nmap.put(201, "Ravi");
		nmap.put(202, "Aman");
		nmap.put(203, "Ashutosh");
		nmap.put(204, "Ajay");
		nmap.put(205, "Akshay");
		nmap.put(206, "Raman");
		nmap.put(207, "Abhijeet");
		
		//Returns key-value pairs whose keys are less than the specified key.  
		System.out.println("headMap: "+ nmap.headMap(202));  
		//Returns key-value pairs whose keys are greater than or equal to the specified key.  
		System.out.println("tailMap: "+ nmap.tailMap(204));  
		//Returns key-value pairs exists in between the specified key.  
		System.out.println("subMap: "+ nmap.subMap(201, 205));   
		
	}

}
