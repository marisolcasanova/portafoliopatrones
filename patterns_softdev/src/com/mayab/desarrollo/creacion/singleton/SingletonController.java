package com.mayab.desarrollo.creacion.singleton;

public class SingletonController {

	public static void main(String[] args) {
		Coordinador c1 = new Coordinador("informatica");
		Coordinador c2 = new Coordinador("industrial");
		
		c1.addClass("lunes", "5", "informatica1");
		c2.addClass("lunes", "5", "industrial1");
		
		ScheduleSingleton.getInstance().print();

	}

}
