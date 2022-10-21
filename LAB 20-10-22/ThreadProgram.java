package corejava_initial.programs;


class threadName implements Runnable
{  
	public void run()
	{  
		System.out.println(Thread.currentThread().getName()+" is running!");
	}
}

public class ThreadProgram {

	public static void main(String[] args) {
		threadName obj = new threadName();
		Thread t1 = new Thread(obj);
		t1.setName("MyThread");
		System.out.println(t1.getName()+ " is created!");
		t1.start();
	}
}
