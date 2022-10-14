import java.io.*;
class Railfence
{
	public static void main(String args[])throws Exception
	{
		String pt,ct="";
		BufferedReader brk=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Plain Text ");
		pt=brk.readLine();
		pt=pt.toLowerCase();
	
		for(int i=0;i<pt.length();i++)
       		{
            		if(i%2==0)
                	ct=ct+pt.charAt(i);
        	}
        	for(int i=0;i<pt.length();i++)
        	{
           		 if(i%2!=0)
                	 ct=ct+pt.charAt(i);
        	}
		System.out.println("Cipher Text "+ct);
	}
}


