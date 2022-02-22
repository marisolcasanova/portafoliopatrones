package com.mayab.desarrollo.parcial1.problema4;

import java.util.Hashtable;

public class Driver {

	public static void main(String[] args) {
		ContextoBaseDatos DBA = new ContextoBaseDatos(new EstrategiaSentenciaDBA());
		ContextoBaseDatos DBB = new ContextoBaseDatos(new EstrategiaSentenciaDBB());
		ContextoBaseDatos DBC = new ContextoBaseDatos(new EstrategiaSentenciaDBC());
		
		Hashtable<String,String> colsYValsDB = obtenerColumnasYValoresBD();
		DBA.persistirDatos(colsYValsDB, "Empleados");
		DBB.persistirDatos(colsYValsDB, "Empleados");
		DBC.persistirDatos(colsYValsDB, "Empleados");

	}
	
	private static Hashtable<String, String> obtenerColumnasYValoresBD() {
		  Hashtable<String, String> d = new Hashtable();
		  d.put("Nombres", "Carlos Enrique");
		  d.put("Apellido", "Lopez");
		  d.put("Sexo", "masculino");
		  d.put("Edad", "34");

		  d.put("Nombres", "Alicia");
		  d.put("Apellido", "Cervantes");
		  d.put("Sexo", "femenino");
		  d.put("Edad", "23");

		  return d;
		}
}
