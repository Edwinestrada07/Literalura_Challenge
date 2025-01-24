package com.aluracursos.Literalura_Challenge.dto;

// DTO (Data Transfer Object) para representar información esencial de un libro y su autor.
// Este `record` es inmutable y compacto, ideal para transferir datos entre capas de la aplicación.

public record LibroAutorDTO(
    String titulo,
    String libroElectronico,
    String nombreAutor
) {
}









//https://github.com/BrayanDiaz89/Literalura_Challenge
//https://github.com/Dev-Asfix/Foro-Hub