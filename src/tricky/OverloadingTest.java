package tricky;

class vehicle{}
class car extends vehicle{}

public class OverloadingTest {
	
	public void m1(vehicle v) {	//here in the method, class type variable is passed
		System.out.println("vehicle version");
	}
	
	public void m1(car c) {
		System.out.println("car version");
	}

	public static void main(String[] args) {
		OverloadingTest t = new OverloadingTest();
		
		vehicle v1 = new vehicle();
		t.m1(v1);	//parent method is called because object reference is parent type
		
		car c1 = new car();
		t.m1(c1);	//child method is called because object reference is parent type
		
		vehicle h = new car();
		t.m1(h);	//parent method is called because in method overloading method resolution is takes care by compiler
					

	}

}
