import java.io.*;
import java.util.Random;
public class Monoalphabetic
{
public int offSet()
{
int ret;
Random ran = new Random();
ret = ran.nextInt(10);
System.out.print(" " + ret);
return ret;
}
public String encrypt(String s)throws IOException
{
StringBuffer sb = new StringBuffer();
for (int i=0; i < s.length(); i++)
{
char t = s.charAt(i);
if ((t >= 'A') && (t <= 'Z') )
{
int t1 =t - 'A' + offSet(); //typecast to char as 2 is int
System.out.println(""+offSet());
t1=t1%26;
sb.append((char)(t1+'A'));
}
else if((t >= 'a') && (t <= 'z'))
{
int t1 =t - 'a' + offSet();
t1=t1%26;
sb.append((char)(t1+'a'));
}
}
return sb.toString();
}
public static void main(String[] args)throws IOException
{
BufferedReader b;
System.out.println("\n\t\tMonoalphabetic Encryption Technique");
System.out.print("\nEnter the string :");
b=new BufferedReader(new InputStreamReader(System.in));
String oriStr=b.readLine();
Monoalphabetic c=new Monoalphabetic();
String encStr=c.encrypt(oriStr);//create object of caesar and call encrypt
System.out.println("\nThe encrypted string is:" + encStr);
System.out.println("\n");
}
}
