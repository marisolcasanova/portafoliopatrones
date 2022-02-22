package com.mayab.desarrollo.creacion.simpleFactory;

public abstract class NissanFabric {
	abstract Car createCar(String item);
	
	public Car orderCar(String type) {
		Car car = createCar(type);
		System.out.println("--- Creating a " + car.getName() + " ---");
		car.assembly();
		return car;
	}

}
