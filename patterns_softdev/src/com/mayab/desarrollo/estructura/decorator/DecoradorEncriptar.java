package com.mayab.desarrollo.estructura.decorator;

public class DecoradorEncriptar extends DecoradorMetodos{
Archivo archivo;
	
	public DecoradorEncriptar(Archivo archivo) {
		this.archivo = archivo;
	}

	@Override
	public String escribir() {
		// TODO Auto-generated method stub
		return "encriptando datos + " + archivo.escribir();
	}

	@Override
	public String leer() {
		// TODO Auto-generated method stub
		return "descomprimiendo datos + " + archivo.leer();
	}

}
