package com.mayab.desarrollo.parcial1.problema1;

public class SubscriptorBitacora implements Subscriptor{
	  String bitacora;

	  public SubscriptorBitacora(String bitacora){
	    this.bitacora = bitacora;
	  }

	  public void actualizar(Evento evento){
		  String mensaje = evento.obtenerMensajeDeEvento();
	    System.out.println("Mandando notificación por bitácora: " + mensaje);
	  }
	}
