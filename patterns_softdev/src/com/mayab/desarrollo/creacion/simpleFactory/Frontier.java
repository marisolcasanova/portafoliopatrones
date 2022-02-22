package com.mayab.desarrollo.creacion.simpleFactory;

public class Frontier extends Car {
	public Frontier() {
		name = "Frontier";
	}
	
	void assembly() {
		System.out.println("attach wheels");
		System.out.println("fit seats");
		System.out.println("another step pickup");
		System.out.println("assemble engine");
		
	}

}
