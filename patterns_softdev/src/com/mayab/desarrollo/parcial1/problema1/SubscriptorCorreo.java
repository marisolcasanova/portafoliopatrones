package com.mayab.desarrollo.parcial1.problema1;

public class SubscriptorCorreo implements Subscriptor{
	  String email;

	  public SubscriptorCorreo(String email){
	    this.email = email;
	  }

	  public void actualizar(Evento evento){
	    String mensaje = evento.obtenerMensajeDeEvento();
	    System.out.println("Mandando notificación por correo electrónico: " + mensaje);
	  }
	}
