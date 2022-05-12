package com.Interface;

interface A{
	void m1();
	void m2();
	
}

abstract class B implements A{
	public void m1() {
		System.out.println("method m1 implemented by B");
	}
}
class C extends B{
//	public void m1() 
//	{
//		System.out.println("method m1 implemented by C");
//	}
	
	public void m2() 
	{
		System.out.println("method m2 implemented by C");
	}
}

class Test1{
	public static void main(String []args) {
		
	  //A r = new C();	// this is also correct,no problem at all
		C r = new C();
		r.m1();
		r.m2();
	}
}	





