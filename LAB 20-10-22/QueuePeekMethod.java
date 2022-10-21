package corejava_initial.programs;

import java.util.*; 

public class QueuePeekMethod {

	public static void main(String[] args) throws IllegalStateException {
		
		// create object of Queue 
        Queue<Integer> Q = new LinkedList<Integer>(); 
  
        // Add numbers to end of Queue 
        Q.add(91); 
        Q.add(78); 
        Q.add(21); 
        Q.add(65); 
  
        // print queue 
        System.out.println("Queue: " + Q); 
  
        // print head 
        System.out.println("Queue's head: " + Q.peek()); 
  
        // print queue 
        System.out.println("Queue: " + Q); 
      } 			
  }

