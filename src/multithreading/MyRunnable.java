package multithreading;

class B implements Runnable{
	
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("SUMAN");
		}
	}
}

public class MyRunnable {

	public static void main(String[] args) {
		
		B r = new B();
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<5; i++)
		{
			System.out.println("ANAND");
		}

	}

}
