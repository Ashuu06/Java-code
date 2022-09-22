package corejava_initial.programs;

//Parent class 
class Shape 
{
   public void display() 
   {
     System.out.println("Parent Display method called");
   }
}

//Child class
//Multilevel Inheritance
class Rectangle extends Shape 
{  
   public void area() 
   {
      System.out.println("Area of Rectangle");
   }
}

class Cube extends Rectangle 
{
   public void volume() 
   {
      System.out.println("Volume of Cube");
   }
}


//Hierarchical Inheritance
class Triangle extends Shape 
{
   public void area() 
   {
     System.out.println("Area of Triangle");
   }
}

class Polygon extends Shape
{
  public void volume() 
  {
    System.out.println("Volume of Polygon");
  }
}

public class MainInherit {
	public static void main(String[] args) {
	  // Creating objects for Multilevel Inheritance
		  System.out.println("Multilevel Inheritance:");
	      Cube cube = new Cube();
	      cube.display();  
	      cube.area();      
	      cube.volume();
	      
	      
	      System.out.println("Hierarchical Inheritance:");
	 //Creating Objects for Hierarchical Inheritance
	      Polygon polygon = new Polygon();
	      polygon.volume();
	      polygon.display();
	}
}
