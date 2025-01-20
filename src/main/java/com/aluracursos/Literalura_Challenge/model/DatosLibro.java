package com.aluracursos.Literalura_Challenge.model;
// Clase que mapea los datos de un libro obtenidos de la API de Literatura API a un objeto Java.
// Utiliza anotaciones de Jackson para ignorar campos desconocidos y mapear claves JSON específicas a los campos:
// - "title" -> titulo (String)
// - "authors" -> autor (List<DatosAutor>)
// - "languages" -> idiomas (List<String>)
// - "download_count" -> numeroDeDescargas (Double)
// Proporciona una representación inmutable del libro.

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
    @JsonAlias("title") String titulo,
    @JsonAlias("authors") List<DatosAutor> autor,
    @JsonAlias("languages") List<String> idiomas,
    @JsonAlias("download_count") Double numeroDeDescargas
) {
}
