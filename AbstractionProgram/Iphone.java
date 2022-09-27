package corejava_initial.programs;

public class Iphone extends Phone{

	@Override
	public void call() {
		System.out.println("The Iphone will use 4G+ network for calling");
		
	}

	@Override
	public void camera() {
		System.out.println("The Iphone will use high megapixel camera");
		
	}

	@Override
	public void internet() {
		System.out.println("The Iphone will provide 4G speed internet");
	}
}
