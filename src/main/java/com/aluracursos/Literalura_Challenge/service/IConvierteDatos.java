package com.aluracursos.Literalura_Challenge.service;
// Interfaz que define un método genérico para convertir cadenas JSON en objetos Java.
// El método obtenerDatos acepta un JSON y una clase, y retorna una instancia de esa clase.
// Usa genéricos para adaptarse a diferentes tipos de datos.

public interface IConvierteDatos {
    //Permite crear tipo de datos genericos, como no se sabe que va a retornar se trabaja como generico
    <T> T obtenerDatos(String json, Class<T> clase);
}
