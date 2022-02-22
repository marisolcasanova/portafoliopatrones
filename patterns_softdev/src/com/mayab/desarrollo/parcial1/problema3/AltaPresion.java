package com.mayab.desarrollo.parcial1.problema3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class AltaPresion extends LlenadoGas {
	  private float horasDeUso;
	  private float bomba;
	  private float materiaPrimaInicial;
	  private float materiaPrimaFinal;
	  private float temperatura;
	  private float presion;
	  private int cantEnvases;

	  public void registrarParamIn(){
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Ingrese el uso de la bomba: ");
	    bomba = Float.parseFloat(scan.nextLine());
	    System.out.println("Ingrese las horas de uso: ");
	    horasDeUso = Float.parseFloat(scan.nextLine());
	    System.out.println("Ingrese el nivel de materia prima inicial: ");
	    materiaPrimaInicial = Float.parseFloat(scan.nextLine());

	  }
	  public void registrarParamFin(){
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Ingrese el nivel de materia prima final: ");
	    materiaPrimaFinal = Float.parseFloat(scan.nextLine());
	    System.out.println("Ingrese la temperatura de los envases llenados: ");
	    temperatura = Float.parseFloat(scan.nextLine());
	    System.out.println("Ingrese la presión a la que están los envases: ");
	    presion = Float.parseFloat(scan.nextLine());

	  }
	  public void calcularVolumen() {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Ingrese la cantidad de envases llenados:  ");
	    cantEnvases = Integer.parseInt(scan.nextLine());
	    float volumen = 0;
	    volumen = (temperatura * (0.08206f) / presion)* cantEnvases;
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
	    consumoMateriaPrima = materiaPrimaFinal - materiaPrimaInicial;
	    System.out.println("-------Reporte--------");
	    System.out.println("Fecha: " + fechaDeHoy);
	    System.out.println("Cantidad envasada: " + cantEnvases);
	    System.out.println("Consumo de materia prima: " + consumoMateriaPrima);
	    System.out.println("Firmas de los operadores e inspectores: ");
	    System.out.println("\n");
	    System.out.println("\n");
	    }
	}
