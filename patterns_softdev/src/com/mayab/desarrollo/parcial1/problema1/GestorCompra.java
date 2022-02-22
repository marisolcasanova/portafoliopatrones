package com.mayab.desarrollo.parcial1.problema1;

public class GestorCompra{
	  GestorEventos gestoreventos;
	  private float umbral;

	  public GestorCompra(GestorEventos gestoreventos, float umbral){
	    this.gestoreventos = gestoreventos;
	    this.umbral = umbral;
	  }

	  public void registrarCompra(Compra compra){
	    System.out.println("Registrando compra...");
	    if (compra.total > umbral) {
	    	gestoreventos.notificarSubscriptores(new EventoCompra(compra));
	    }
	  }
	}  
