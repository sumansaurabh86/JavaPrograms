package keyword;

//this keyword cals Non Argumented Constructor

public class NA {
	
	NA()
	{
		System.out.println("Learn Codding");
	}
	
	NA(int a)
	{
		this();
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		NA obj = new NA(1000);
		
	}

}
