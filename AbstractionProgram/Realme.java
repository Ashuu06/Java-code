package corejava_initial.programs;

public class Realme extends Phone {

	@Override
	public void call() {
		System.out.println("The realme phone will 3G network for calling");
		
	}

	@Override
	public void camera() {
		System.out.println("The realme phone will use average camera");
		
	}

	@Override
	public void internet() {
		System.out.println("The realme phone provide 3G internet speed");
	}

}
