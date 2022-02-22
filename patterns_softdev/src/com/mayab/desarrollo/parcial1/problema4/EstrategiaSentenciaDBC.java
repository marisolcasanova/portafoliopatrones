package com.mayab.desarrollo.parcial1.problema4;

import java.util.Hashtable;

public class EstrategiaSentenciaDBC implements EstrategiaSentencia {
	  public String crearSentencia(Hashtable<String, String> camposValores, String tabla){
	    String columnas = String.join(",", camposValores.keySet());
	    String valores = String.join(",", camposValores.values());
	    return String.format("INSERT INTO %s (%s) VALUES (%s)", tabla, columnas, valores);
	  }
	}
