package Method;

class Test  {
	
	void display() {
		
		System.out.println("A non static function is called");
	}

	static void show() {
		
		System.out.println("A static function is called");
	}
	
	Test()
	{
		System.out.println("constructor is called");
	}
}	

public class StaticDemo {	
	
	public static void main(String[] args) {
		
		Test obj = new Test();	//constructor is invoked
		obj.display();			
		
		Test.show();			//static method is invoked by class name because this method is called
								//from different class, if it is called from same class Test then we
								//simply write show();
	
		
		
	}

}
