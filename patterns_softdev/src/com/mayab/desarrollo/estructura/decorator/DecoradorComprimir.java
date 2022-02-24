package com.mayab.desarrollo.estructura.decorator;

public class DecoradorComprimir extends DecoradorMetodos {
	Archivo archivo;
	
	public DecoradorComprimir(Archivo archivo) {
		this.archivo = archivo;
	}

	@Override
	public String escribir() {
		// TODO Auto-generated method stub
		return "comprimiendo datos + " + archivo.escribir();
	}

	@Override
	public String leer() {
		// TODO Auto-generated method stub
		return "descomprimiendo datos + " + archivo.leer();
	}
	

}
