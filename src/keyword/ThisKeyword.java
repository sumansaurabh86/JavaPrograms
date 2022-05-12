package keyword;

//this keyword refers current class instance variable
public class ThisKeyword {
	
	void show()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {
		
		ThisKeyword obj=new ThisKeyword();
		obj.show();
		System.out.println(obj);

	}

}
