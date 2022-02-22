package com.mayab.desarrollo.parcial1.problema4;

import java.util.Hashtable;

public class EstrategiaSentenciaDBA implements EstrategiaSentencia {
	  public String crearSentencia(Hashtable<String, String> camposValores, String tabla){
	    String columnas = String.join(",", camposValores.keySet()).toUpperCase();
	    String valores = String.join(",", camposValores.values()).toUpperCase();
	    return String.format("INSERT INTO %s (%s) VALUES (%s)", tabla.toUpperCase(), columnas, valores);
	  }
}