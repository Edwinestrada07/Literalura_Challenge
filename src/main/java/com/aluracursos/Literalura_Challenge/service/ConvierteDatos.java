package com.aluracursos.Literalura_Challenge.service;
// Clase que implementa la conversión de JSON a objetos Java usando la librería Jackson.
// El método obtenerDatos utiliza ObjectMapper para deserializar el JSON en una instancia de la clase especificada.
// Lanza RuntimeException si ocurre un error durante la conversión.

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos { 
    private ObjectMapper objectMapper = new ObjectMapper();
    
    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        System.out.println("JSON recibido: " + json);

        if (json == null || json.isBlank()) {
            throw new IllegalArgumentException("El JSON proporcionado está vacío o es nulo.");
        }
        try {
            return objectMapper.readValue(json, clase); // No es necesario json.toString()
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error procesando el JSON: " + e.getMessage(), e);
        }
    }
}


