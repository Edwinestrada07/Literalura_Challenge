package com.aluracursos.Literalura_Challenge.principal;

import com.aluracursos.Literalura_Challenge.service.ConsumoAPI;
import com.aluracursos.Literalura_Challenge.service.ConvierteDatos;

public class Principal {
    //Intancio las clases creadas en service para leer la url de la API
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    
    //URL base de la API
    private static final String URL_BASE = "https://gutendex.com/books/";

    public void muestraElMenu() {
        var json = consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);
        //var datos = conversor.obtenerDatos(json,Datos.class);
    }

}
