package lab5;

public class MainBank {

	public static void main(String[] args) {
	    SBI sbi = new SBI();
	    ICICI icici = new ICICI();
	    AXIS axis = new AXIS();
		System.out.println("Rate of Interest in SBI is: "+sbi.getRateOfInterest()+"%");
		System.out.println("Rate of Interest in ICICI is: "+icici.getRateOfInterest()+"%");
	    System.out.println("Rate of Interest in AXIS is: "+axis.getRateOfInterest()+"%");
	}

}
