package com.mayab.desarrollo.creacion.simpleFactory;

public class Sentra extends Car {
	public Sentra() {
		name = "Sentra";
	}
	
	void assembly() {
		System.out.println("attach wheels");
		System.out.println("fit seats");
		System.out.println("another step sedan");
		System.out.println("assemble engine");
		
	}

}
