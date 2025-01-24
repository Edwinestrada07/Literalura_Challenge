package com.aluracursos.Literalura_Challenge.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Formats(
    @JsonAlias("image/jpeg") String poster,
    @JsonAlias("application/octet-stream") String libroElectronico
) {
}
