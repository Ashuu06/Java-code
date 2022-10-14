import java.io.*;
import java.math.*; 
import java.security.*; 
public class Diffehellman
{ 
BigInteger n,g,x,y,a,b;
public Diffehellman() throws IOException
{
SecureRandom r=new SecureRandom();
n=new BigInteger(512,100,r);
g=new BigInteger(512,100,r);
System.out.println("prime no. n (by Alice and Bob) is "+n.intValue());
System.out.println("prime no. g (by Alice and Bob) is "+g.intValue());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the value of x(Alice) : ");
BigInteger x= new BigInteger(br.readLine());
System.out.print("Enter the value of y(Bob) : ");
BigInteger y= new BigInteger(br.readLine());
BigInteger A=calculate(g,x,n);
System.out.println("Value of A(Alice) is "+A.intValue());
BigInteger B=calculate(g,y,n);
System.out.println("Value of B(Bob) is "+B.intValue());
BigInteger cal_k1=calculate(B,x,n);
System.out.println("Value of k1 is "+cal_k1.intValue());
BigInteger cal_k2=calculate(A,y,n);
System.out.println("Value of k2 is "+cal_k2.intValue());
}
BigInteger calculate(BigInteger l,BigInteger m,BigInteger n)
{
return l.modPow(m,n);
}
public static void main(String[] args) throws IOException
{
new Diffehellman(); 
}
}
 
