package com.mayab.desarrollo.creacion.simpleFactory;

public class Pickup2 extends Car {
	public Pickup2() {
		name = "Pickup 2";
	}
	
	void assembly() {
		System.out.println("attach wheels");
		System.out.println("fit seats");
		System.out.println("another step pickup");
		System.out.println("assemble engine");
		
	}

}
