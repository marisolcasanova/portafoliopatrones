package com.mayab.desarrollo.estructura.decorator;

public class ArchivoTexto extends Archivo {

	@Override
	public String escribir() {
		// TODO Auto-generated method stub
		return "escribiendo datos";
	}

	@Override
	public String leer() {
		// TODO Auto-generated method stub
		return "leyendo datos";
	}

}
