package corejava_initial.programs;

public class Rectangles {
	   private double length;  // To hold length of rectangle
	   private double width;   // To hold width of rectangle

	   public Rectangles()
	   {
	      length = 0;
	      width = 0;
	   }

	   public Rectangles(double length, double width)
	   {
	       this.length = length;
	       this.width = width;
	   }

	   public double getArea()
	   {
	       return length * width;
	   }

}
