package com.mayab.desarrollo.parcial1.problema1;

public class EventoCompra implements Evento{
	  private Compra compra;

	  public EventoCompra(Compra compra){
	    this.compra = compra;
	  }

	  public String obtenerMensajeDeEvento(){
	    return "Total de la compra: " + compra.total;
	  }
	}
