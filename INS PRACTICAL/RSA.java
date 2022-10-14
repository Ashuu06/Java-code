import java.io.*;
import java.math.*;
import java.security.*;
class RSA
{
public static void main(String args[])
	{
BigInteger p,q,n,d,e,ph;
		SecureRandom r;
		r=new SecureRandom();
		p=new BigInteger(512,100,r);
		q=new BigInteger(512,100,r);
		System.out.println("prime nos p and q are "+p.intValue()+" , "+q.intValue());
		n=p.multiply(q);
		ph=(p.subtract(new BigInteger("1")));
		ph=ph.multiply(q.subtract(new BigInteger("1")));
		e=new BigInteger("2");//initial
		while(ph.gcd(e).intValue() > 1 || e.compareTo(ph) !=-1)
		e = e.add(new BigInteger("1"));//or "2" when bug
		d=e.modInverse(ph);
		System.out.println("public key is ("+n.intValue()+" , "+e.intValue()+")");
		System.out.println("pvt key is ("+n.intValue()+" , " +d.intValue()+")");
		BigInteger msg= new BigInteger("15");
		System.out.println("\nMessage is: "+msg);
		BigInteger enmsg=msg.modPow(e,n);
		System.out.println("\nEncryptedmsg is: "+enmsg.intValue());
		BigInteger demsg=enmsg.modPow(d,n);
		System.out.println("\nDecryptedmsg is: "+demsg.intValue());
}}

	
