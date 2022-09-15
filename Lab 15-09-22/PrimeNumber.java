import java.util.Scanner;
public class PrimeNumber
 {
   public static void main (String[]args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the lower limit:");
     int lower = sc.nextInt();
	System.out.print("Enter the upper limit:");
	int upper = sc.nextInt();

     for (int i = lower; i <= upper; i++)
       if (isPrime (i))
        System.out.println ("The prime numbers between " + lower + " and " + upper + " limit is: "+i);
   }

   static boolean isPrime (int n)
   {
     int count = 0;

     if (n < 2)
       return false;

     for (int i = 2; i < n; i++)
       {
     if (n % i == 0)
        return false;
       }
     return true;
   }
 }