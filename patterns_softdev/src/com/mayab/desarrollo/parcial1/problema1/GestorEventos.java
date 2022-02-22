package com.mayab.desarrollo.parcial1.problema1;

import java.util.ArrayList;

public class GestorEventos{
	  ArrayList<Subscriptor> subscriptores = new ArrayList<>();

	  public void subscribir(Subscriptor s){
	    subscriptores.add(s);
	  }

	  public void eliminarSubscriptor(Subscriptor s){
	    subscriptores.remove(s);
	  }

	  public void notificarSubscriptores(Evento evento){
	    for (Subscriptor sub: subscriptores){
	      sub.actualizar(evento);
	    }
	  }
}
