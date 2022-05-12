package com.Interface;

interface vehicle{
	
	void wheel();
	void colour();
}

class car implements vehicle {
	
	@Override
	public void wheel() {
		System.out.println("Four wheels");
		
	}
	
	@Override
	public void colour() {
		System.out.println("colour is red");
	}
}
	


class bus implements vehicle {
	@Override
	public void wheel() {
		System.out.println("six wheels");
	}
	
	@Override
	public void colour() {
		System.out.println("colour is yellow");
	}
}


public class TestVehicle {

	public static void main(String[] args) {
		car c = new car();
		bus b = new bus();
		
		c.wheel(); c.colour();
		b.wheel();b.colour();
		

	}

}
