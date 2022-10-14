import javax.crypto.*;
import java.io.*;
import java.security.*;
import java.security.spec.*;
import java.lang.*;
class DES
{
	public static void main(String args[])throws Exception
	{
		BufferedReader brk=new BufferedReader(new InputStreamReader(System.in));
		String pt="",ct="",ot="";
		System.out.print("Enter Plain Text ");
		pt=brk.readLine();
		SecretKey key =KeyGenerator.getInstance("DES").generateKey();
		Cipher ecipher = Cipher.getInstance("DES");
		ecipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] rdata = pt.getBytes("UTF8");
		byte[] enc = ecipher.doFinal(rdata);
Cipher dcipher = Cipher.getInstance("DES");
		dcipher.init(Cipher.DECRYPT_MODE, key);
		System.out.println("Plain Text "+pt);
		System.out.println("Ciphir Text "+ct);
		System.out.println("Original Text "+ot);
                        }
                   }
