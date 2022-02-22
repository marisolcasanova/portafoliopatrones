package com.mayab.desarrollo.parcial1.problema3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Liquido extends LlenadoGas {
	  private float NivInicialMatPrima;
	  private float NivActualMatPrima;
	  
	  public void registrarParamIn(){
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Ingrese el nivel inicial de materia prima: ");
	    NivInicialMatPrima = Float.parseFloat(scan.nextLine());
	  }
	  
	  public void registrarParamFin(){
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Ingrese el nivel actual de materia prima: ");
	    NivActualMatPrima = Float.parseFloat(scan.nextLine());
	  }
	  
	  public void calcularVolumen() {
	    float volumen = 0;
	    volumen = NivInicialMatPrima - NivActualMatPrima;
	    System.out.println("El volumen es: " + volumen);

	  }
	  public void realizarInspeccionSeguridad() {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Proporcione la ruta (location) del archivo TXT del checklist de seguridad:  ");
	    String ruta = scan.nextLine();
	    try
	    {
	      FileInputStream archivoChecklist = new FileInputStream(ruta);
	      Scanner scannerArchivo = new Scanner(archivoChecklist);
	      while(scannerArchivo.hasNextLine()){
	        System.out.println(scannerArchivo.nextLine());
	      }
	      scannerArchivo.close();
	    }
	    catch(IOException e){
	      System.out.println("No se pudo leer el checklist");
	    }
	  }
	  
	  public void imprimirReporte() {
	    var fechaDeHoy = LocalDateTime.now();

	    float consumoMateriaPrima = 0;
	    consumoMateriaPrima = NivInicialMatPrima - NivActualMatPrima;
	    System.out.println("-------Reporte--------");
	    System.out.println("Fecha: " + fechaDeHoy);
	    System.out.println("Consumo de materia prima: " + consumoMateriaPrima);
	    System.out.println("Firmas de los operadores e inspectores: ");
	    System.out.println("\n");
	    System.out.println("\n");
	    }
	    
	  }