package corejava_initial.programs;

public class MainAndroid {

	public static void main(String[] args) {
		AndroidPhone p1 = new AndroidPhone(6,"Oceanic Blue",64);
		AndroidPhone p2 = new AndroidPhone(8,"Night Black",128);
		AndroidPhone p3 = new AndroidPhone(12,"Peacock Green",256);
		AndroidPhone p4 = new AndroidPhone(16,"Crystal White",512);
		
		
		AndroidPhone[] phonearray = new AndroidPhone[4];
		phonearray[0] = p1;
		phonearray[1] = p2;
		phonearray[2] = p3;
		phonearray[3] = p4;
		
		
		for(AndroidPhone phone:phonearray) 
		{
			System.out.println("Ram: "+phone.ram+ " ,Color of Phone: "+phone.color+ " ,Storage of phone: "+phone.storage);
			
		}
		
	}

}
