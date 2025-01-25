package com.aluracursos.Literalura_Challenge.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String fechaNacimiento;
    private String fechaDeceso;
    @ManyToMany
    @JoinTable(
            name = "autor_libro",
            joinColumns = @JoinColumn(name = "autor_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    private List<Libro> libros = new ArrayList<>();

    public Autor() {}
    
    // Constructor personalizado para inicializar un objeto Autor.
    // - Permite asignar el nombre explícitamente y mapear las fechas desde un objeto DatosAutor.
    public Autor(String nombre, DatosAutor a) {
        this.nombre = nombre;
        this.fechaNacimiento = a.fechaNacimiento();
        this.fechaDeceso = a.fechaDeceso();
    }

    // Getters y setters para los atributos de la clase Autor.
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaDeceso() {
        return fechaDeceso;
    }
    public void setFechaDeceso(String fechaDeceso) {
        this.fechaDeceso = fechaDeceso;
    }

    public List<Libro> getLibros() {
        return libros;
    }
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return 
                ">>>>>>>>>>>>>>>>>>>>>>>>>>>> AUTOR <<<<<<<<<<<<<<<<<<<<<<<<<<<\n" +
                " nombre=" + nombre + "\n" +
                ", fechaNacimiento=" + fechaNacimiento + "\n" +
                ", fechaDeceso=" + fechaDeceso + "\n" +
                " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>><><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n";
    }
}
