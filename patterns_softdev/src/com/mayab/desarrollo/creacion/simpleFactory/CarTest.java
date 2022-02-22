package com.mayab.desarrollo.creacion.simpleFactory;

public class CarTest {

	public static void main(String[] args) {
		NissanFabric sedancar = new Sedan();
		NissanFabric pickupcar = new Pickup();
		NissanFabric electricar = new Electric();
		
		Car car = sedancar.orderCar("Sedan 3");
		System.out.println("Client Rosa ordered a " + car.getName() + "\n");
		
		car = pickupcar.orderCar("Frontier");
		System.out.println("Client Jorge ordered a " + car.getName() + "\n");
		
		car = electricar.orderCar("Leaf");
		System.out.println("Client Luis ordered a " + car.getName() + "\n");

	}

}
