package com.mayab.desarrollo.parcial1.problema1;

public class SubscriptorSMS implements Subscriptor{
	  String numtel;

	  public SubscriptorSMS(String numtel){
	    this.numtel = numtel;
	  }

	  public void actualizar(Evento evento){
		  String mensaje = evento.obtenerMensajeDeEvento();
	    System.out.println("Mandando notificación por SMS: " + mensaje);
	  }
	}
