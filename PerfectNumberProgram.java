import java.util.Scanner;
class PerfectNumberProgram
{
public static void main(String main[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Start Number");
    int start=sc.nextInt();
    System.out.println("Enter End Number");
    int end=sc.nextInt();
    System.out.println("Perfect Numbers between " + start + " and " + end + " are :");
    for (int i=start; i<=end; i++)
    {
    int sum=0;
    for (int j=1 ; j<i;j++)
        {
            if (i % j==0)  sum=sum+j;
        }
     if (i==sum) System.out.print(i + "\t");
    }
  }
}
