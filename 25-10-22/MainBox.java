package corejava_initial.programs;

public class MainBox {
	public static void main(String[] args)
	   {
	      // Create a box object.
	      Box myBox1 = new Box();

	      // Display the volume of myBox1.
	      System.out.println("Volume: " + myBox1.getVolume());

	      // Create a box object.
	      Box myBox2 = new Box(12.2, 3.5, 2.0);

	      // Display the volume of myBox2.
	      System.out.println("Volume: " + myBox2.getVolume());
	   }
}
