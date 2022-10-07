package lab5;

public class MethodOverloading {
	public void area(int length, int breadth) 
	{
		int result = length * breadth;
		System.out.println(result);
	}
	
	public void area(double length, double breadth) 
	{
		double result = length * breadth;
		System.out.println(result);
	}

	public static void main(String[] args) 
	{
		MethodOverloading m = new MethodOverloading();
		m.area(7, 3);
		m.area(5.6, 3.5);
	}


}
