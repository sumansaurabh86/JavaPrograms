package dummy;

public class SwappingNumber {

	public static void main(String[] args) {
		int a=10, b=15 , temp;
		System.out.println("Actual number before swaping is " + a + " and "+ b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("Number after swaping is " + a + " and "+ b);

	}

}
