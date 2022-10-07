package lab5;

public class Tvs extends Bike{
	String name="Tvs Apache 400";
	int max_speed=135;
	String color="Sky Blue";
	
	@Override
	void moving() {
		System.out.println("Tvs Apache moving");
	}

	@Override
	void gearChange() {
		System.out.println("Shifting gears all up");
	}
}
