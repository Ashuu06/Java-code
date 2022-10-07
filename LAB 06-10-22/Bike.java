package lab5;

public abstract class Bike {
	
	public void start() {
		System.out.println("Bike is starting...");
	}
	
	public void Mileage() {
		System.out.println("Average Mileage of Bike is 20km/litre");
	}

	abstract void gearChange();
	
	abstract void moving();

}
