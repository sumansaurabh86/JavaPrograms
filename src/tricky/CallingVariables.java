package tricky;

class Add{
	
	int a, b, total;
	
	void sum() 
	{
		total = a+b;
	}
}


class CallingVariables {

	public static void main(String[] args) {
		
		Add obj = new Add();
		obj.a = 10;
		obj.b = 40;
		obj.sum();
		
		System.out.println("Addition = " + obj.total);
		

	}

}
