import java.util.Scanner;

class PrimeNumber {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		primeNumberCheck(n);	
	}

	static void primeNumberCheck(int n) 
	{
		int isprime = 1;
		if (n == 0 || n == 1)
		 {
			System.out.print(n + " is not a prime number");
		}
		else 
		{
			for (int i = 2; i <= n/2; i++) 
			{
				if (n % i == 0) 
				{
					System.out.print(n + "is not a prime number");
					isprime = 0;
					break;
				}
			}
			if (isprime == 1) 
			{
				System.out.print(n + " is a prime Number");
			}
		}
	}

}