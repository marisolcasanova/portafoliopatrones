package com.mayab.desarrollo.creacion.simpleFactory;

public class Leaf extends Car {
	public Leaf() {
		name = "Leaf";
	}
	
	void assembly() {
		System.out.println("attach wheels");
		System.out.println("fit seats");
		System.out.println("another step electric");
		System.out.println("assemble engine");
		
	}

}
