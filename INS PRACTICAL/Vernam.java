
import java.io.*;
import java.util.*;
public class Vernam
{
char vernamTable[][]= new char[26][26];
public void GenereatePad()
{
char array[] = new char[26];
char c = 'a';
for(int x=0;x<26;x++)
{
array[x] = c;
c++;
}
int i,j,k;
i = 0;
while(i < 26)
{
k = i;
 for (j=0;j<26;j++)
 {
 if (k>=26)
 k = 0;
 vernamTable[i][j] = array[k++];
 }
 i++;
 }
 }

 private String key;
 public Vernam(String k)
 {
 key = k;
}
 public String encrypt(String plainText)
 {
 char[] plainTextArr = plainText.toCharArray();
 while(key.length()<plainText.length())
 {
 key += key;
 }
 key = key.substring(0,plainText.length());
System.out.println(key);
 char [] keyArray = key.toCharArray();
 String cipherText = "";
 for(int i=0; i<plainText.length();i++)
 {
 int rowpos = keyArray[i]-'a';
 int colpos = plainTextArr[i]-'a';
 cipherText += vernamTable[rowpos][colpos];
 }
 return cipherText;
 }
 public String decrypt(String cipherText)
 {
 String plainText = "";
 char[] cipherTextArr = cipherText.toCharArray();
 char [] keyArray = key.toCharArray();
 char [] plainTextArr = new char[keyArray.length];
 for(int i=0; i<keyArray.length; i++)
 {
 int rowpos = keyArray[i] - 'a';
 int cipherpos = new
String(vernamTable[rowpos]).indexOf(cipherTextArr[i]);
 plainTextArr[i] = vernamTable[0][cipherpos];
 }
 plainText = new String(plainTextArr);
 return plainText;
}

 public static void main(String args[])
 {
 Scanner console = new Scanner(System.in);
System.out.println("\nEnter a text key :");
 String keyText = console.nextLine();
 Vernam algo = new Vernam(keyText);
 algo.GenereatePad();
 System.out.println("\nEnter the plain text");
 String plainText = console.nextLine();
 String cipherText = algo.encrypt(plainText);
 System.out.println("\nThe encrypted text is "+cipherText);
 plainText = algo.decrypt(cipherText);
 System.out.println("\nThe decrypted text is "+plainText);
 }
}
