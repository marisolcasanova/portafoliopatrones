package com.mayab.desarrollo.creacion.simpleFactory;

public abstract class Car {
	String name;
	
	
	public String getName() {
		return name;
	}
		
	void assembly() {
		System.out.println("attach wheels");
		System.out.println("fit seats");
		System.out.println("assemble engine");
		
	}
	

}
