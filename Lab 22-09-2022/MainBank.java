package corejava_initial.programs;

//Main method to create objects and call the methods.  
public class MainBank {

	public static void main(String[] args) {
		SBI s=new SBI();  
		ICICI i=new ICICI();  
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()+"%");
		System.out.println("SBI provides "+s.accountOpening());
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest()+"%");
		System.out.println("ICICI provides "+i.accountOpening());
	}
}
