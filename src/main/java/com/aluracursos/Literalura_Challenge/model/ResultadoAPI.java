package com.aluracursos.Literalura_Challenge.model;
// Clase que mapea la respuesta de la API de Literatura API a un objeto Java utilizando un record.
// La anotación @JsonIgnoreProperties permite ignorar campos no utilizados en el JSON de entrada.
// El campo libros mapea la clave "results" del JSON a una lista de objetos DatosLibro, gracias a la anotación @JsonAlias.

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Esta clase representa la estructura de la respuesta de la API de Literatura API
@JsonIgnoreProperties(ignoreUnknown = true)
public record ResultadoAPI(
    @JsonAlias("results") List<DatosLibro> libros
) {
}
