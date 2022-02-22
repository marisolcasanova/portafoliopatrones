package com.mayab.desarrollo.parcial1.problema4;

import java.util.Hashtable;

public class EstrategiaSentenciaDBB implements EstrategiaSentencia {
    public String crearSentencia(Hashtable<String, String> camposValores, String tabla){
    String columnas = String.join(",", camposValores.keySet()).toLowerCase();
    String valores = String.join(",", camposValores.values()).toLowerCase();
    return String.format("INSERT INTO %s (%s) VALUES (%s)", tabla.toLowerCase(), columnas, valores);
  }
}
