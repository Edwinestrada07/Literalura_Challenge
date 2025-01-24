package com.aluracursos.Literalura_Challenge.model;
// Clase que mapea la respuesta de la API de GutendexAPI a un objeto Java utilizando un record.
// La anotación @JsonIgnoreProperties permite ignorar campos no utilizados en el JSON de entrada.
// El campo libros mapea la clave "results" del JSON a una lista de objetos DatosLibro, gracias a la anotación @JsonAlias.

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Esta clase representa la estructura de la respuesta de la API de GutendexAPI
@JsonIgnoreProperties(ignoreUnknown = true)
public record ResultadoAPI(
    @JsonAlias("results") List<DatosLibro> libros
) {
}

//Un record en Java es una estructura de datos inmutable que define una clase con campos. Los records son una alternativa a 
//las clases y se utilizan para crear dataclases de manera rápida. 