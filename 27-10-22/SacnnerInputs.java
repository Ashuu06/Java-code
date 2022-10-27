package corejava_initial.programs;

import java.util.Scanner;

public class SacnnerInputs {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String str = sc.nextLine();
		
		System.out.print("Enter your Id: ");  
		int n = sc.nextInt();
		
		System.out.print("Enter your Bank Balance: ");
		double d = sc.nextDouble();
		
		System.out.print("Are you above 18?:(True/False) "); 
		boolean bn = sc.nextBoolean(); 
		
		
		System.out.println("Name:"+str);
		System.out.println("ID: "+n);
        System.out.println("Bank Balance: "+d); 
        System.out.println("Age is above 18:"+bn);
        
        sc.close();
        
	}
}
