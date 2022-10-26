package corejava_initial.programs;

public class Box extends Rectangles{
	private double height;  // To hold height of the box

	   public Box()
	   {
	      // Call the superclass default constructor to
	      // initialize length and width.
	      super();
	      //Initialize height.
	      height = 0;
	   }


	    public Box(double length, double width, double height)
	    {
	      // Call the superclass constructor to
	      // initialize length and width.
	      super(length, width);
	      
	      // Initialize height.
	      this.height = height;
	   }

	   public double getVolume()
	   {
	      return getArea() * height;
	   }
	
}
