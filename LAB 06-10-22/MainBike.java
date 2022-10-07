package lab5;

public class MainBike {

	public static void main(String[] args) {
	    Bike b1 = new Honda();
		Bike b2 = new Tvs();
		
		b1.start();
		b1.moving();
		if (b1 instanceof Bike) 
		{
			System.out.println(((Honda) b1).name);
			System.out.println(((Honda) b1).color);
		}
		System.out.println();
		
		b2.start();
		b2.moving();
		if (b2 instanceof Bike) {
			System.out.println(((Tvs) b2).name);
			System.out.println(((Tvs) b2).color);	
		}
		System.out.println();
	}
}
