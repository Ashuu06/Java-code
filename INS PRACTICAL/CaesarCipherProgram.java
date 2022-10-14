import java.io.*;
class  CaesarCipherProgram
{
	public static void main(String args[])throws Exception
	{
		String pt,ct="";
		int key=3;
		BufferedReader brk=new BufferedReader(new       InputStreamReader(System.in));
		System.out.print("Enter Plain Text ");
		pt=brk.readLine();
		pt=pt.toLowerCase();
		for(int  i=0;i<pt.length();i++)
		{
			int acvalue=(int)pt.charAt(i);
			acvalue=acvalue+key;
			if(acvalue>122)
			{
				int diff=acvalue-122;
				acvalue=96+diff;
			}
			ct=ct+(char)acvalue;
		}
		System.out.println(ct);
	}
}
