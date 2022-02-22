package com.mayab.desarrollo.parcial1.problema4;

import java.util.Hashtable;

public class ContextoBaseDatos {
	  private EstrategiaSentencia estrategiaSentencia;

	  public ContextoBaseDatos(EstrategiaSentencia estrategia) {
		  this.estrategiaSentencia = estrategia;
	  }
	
	  public void persistirDatos(Hashtable<String, String> camposValores, String tabla){
	  abrirConexion();
	  String sentencia = crearSentencia(camposValores, tabla);
	  ejecutarSentencia(sentencia);
	  }
	
	  private void abrirConexion(){
	    System.out.println("Abriendo conexión a base de datos...");
	  }
	  private String crearSentencia(Hashtable<String, String> camposValores, String tabla){
	    return estrategiaSentencia.crearSentencia(camposValores, tabla);
	  }
	  private void ejecutarSentencia(String sentencia){
	    System.out.println("Ejecutando sentencia...");
	    System.out.println(sentencia);
	  }
}
