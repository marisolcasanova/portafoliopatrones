package com.mayab.desarrollo.estructura.decorator;

public class Driver {

	public static void main(String[] args) {
		Archivo archivo = new ArchivoTexto();
			
		archivo = new DecoradorComprimir(archivo);
		System.out.println("Leer comprimido = " + archivo.leer());
		System.out.println("Escribir comprimido = " + archivo.escribir());
		
		archivo = new DecoradorEncriptar(archivo);
		System.out.println("Escribir comprimido + encriptado = " + archivo.escribir());
		

	}

}
