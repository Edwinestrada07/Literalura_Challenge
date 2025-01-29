package com.aluracursos.Literalura_Challenge.principal;

import java.util.*;

import com.aluracursos.Literalura_Challenge.model.*;
import com.aluracursos.Literalura_Challenge.repository.LibroRepository;
import com.aluracursos.Literalura_Challenge.service.ConsumoAPI;
import com.aluracursos.Literalura_Challenge.service.ConvierteDatos;

public class Principal {
    private Scanner teclado = new Scanner(System.in);

    private LibroRepository repository;

    //Intancio las clases creadas en service para leer la url de la API
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    
    //URL base de la API
    private static final String URL_BASE = "https://gutendex.com/books/";

    public void muestraElMenu() {
        var opcion = -1;
        System.out.println("|--   ¡Bienvenido a la API de Guntendex de libros!   --|");
        while (opcion != 0) {
                var menu = """
                    ------|=!=!=| - Menú principal: - |=!=!|------
                    | Elige una opción para navegar en tú catálogo:
                    | 1) Buscar libro
                """;

            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    buscarLibroWeb();
                    break;
            

                    
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }    
    }

    private DatosLibro getDatosLibro() {
        System.out.println("Escribe el nombre del libro que deseas buscar");
        var nombreLibro = teclado.nextLine();
        var json = consumoAPI.obtenerDatos(URL_BASE + nombreLibro.replace(" ", "+"));
        System.out.println(json);
        DatosLibro datos = conversor.obtenerDatos(json, DatosLibro.class);
        return datos;
    }

    //Métodos
    private void buscarLibroWeb() {
        DatosLibro datos = getDatosLibro();
        Libro libro = new Libro(datos);
        repository.save(libro);
        System.out.println(datos);
    }
}
