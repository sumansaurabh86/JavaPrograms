package multithreading;

class A extends Thread{
	
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("SUMAN");
		}
	}
}


public class ThreadClass {

	public static void main(String[] args) {
		
		A t= new A();	//instantiation of a new thread and till now only one main thread
						//or child thread object created but not yet started
		
		t.start();		//main thread started child thread and now there are two threads
		for(int i=0; i<5; i++)
		{
			System.out.println("AMIT");
		}
	}

}
