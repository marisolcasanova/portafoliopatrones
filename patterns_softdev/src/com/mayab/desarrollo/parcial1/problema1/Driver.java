package com.mayab.desarrollo.parcial1.problema1;

public class Driver {

	public static void main(String[] args) {
	    // Instanciar subscriptores
	    // Registrar subscriptores por canal de comunicación y usuario
	    SubscriptorCorreo subCorreo1 = new SubscriptorCorreo("marisol@gmail.com");
	    SubscriptorSMS subSms1 = new SubscriptorSMS("98143702313");
	    SubscriptorBitacora log = new SubscriptorBitacora("log.txt");

	    // Agregar subscriptores a gestor eventos (Subscribir)
	    GestorEventos eventos = new GestorEventos();

	    eventos.subscribir(subCorreo1);
	    eventos.subscribir(subSms1);
	    eventos.subscribir(log);

	    GestorCompra gestorCompras = new GestorCompra(eventos, 60);
	    // Registrar compra
	    gestorCompras.registrarCompra(new Compra(100.0f));

	    // Eliminar alguna subscripción
	    eventos.eliminarSubscriptor(subSms1);

	    // Registrar otra compra
	    gestorCompras.registrarCompra(new Compra(200.0f));

	}

}
