package lab5;

public class Honda extends Bike{
	String name="Honda Dream Shine";
	int max_speed=120;
	String color="Dark Black";
	
	@Override
	void moving() {
		System.out.println("Honda moving");
	}

	@Override
	void gearChange() {
		System.out.println("Shifting all gears down");
	}
}
