package corejava_initial.programs;

import java.util.*; 

public class QueuePollMethod {

	public static void main(String[] args)throws IllegalStateException  {
		
		// create object of Queue 
        Queue<Integer> Q = new LinkedList<Integer>(); 
  
        // Add numbers to end of Queue 
        Q.add(72); 
        Q.add(35); 
        Q.add(52); 
        Q.add(91); 
  
        // print queue 
        System.out.println("Queue: " + Q); 
  
        // print head and deletes the head 
        System.out.println("Queue's head: " + Q.poll()); 
  
        // print head and deleted the head 
        System.out.println("Queue's head: " + Q.poll()); 
        
        System.out.println("Queue: " + Q); 
		
	}
}
