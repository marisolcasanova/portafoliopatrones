package com.mayab.desarrollo.parcial1.problema2;

public class Driver {

	public static void main(String[] args) {
		//se instancia un producto
		Producto leche1 = new Producto(34.50f, "lacteo");
		Cliente cliente1 = new Cliente();
		
		Producto leche2 = new Producto(34.50f, "lacteo");
		Cliente cliente2 = new Cliente();
		
		//se calcula el precio final ingresando el tipo del producto y la localidad
		float costoc1 = cliente1.calcularCosto(leche1, "frontera");
		System.out.println("El precio final con impuestos del producto es: " + costoc1);
		
		float costoc2 = cliente2.calcularCosto(leche2, "campeche");
		System.out.println("El precio final con impuestos del producto es: " + costoc2);
		

	}

}
