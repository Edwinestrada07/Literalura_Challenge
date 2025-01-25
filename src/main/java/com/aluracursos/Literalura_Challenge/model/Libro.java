package com.aluracursos.Literalura_Challenge.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    private String lenguaje;
    private String poster;
    private String libroElectronico;
    private Double numeroDeDescargas;
    @ManyToMany(mappedBy = "libros", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Autor> autores = new ArrayList<>();

    //JPA nos exige tener un constructor predeterminado con el mismo nombre del personalizado, ya él internamente
    //reconoce el personalizado que tenemos después.
    public Libro() {} //Constructor predeterminado.

    //Constructor personalizado
    // Constructor personalizado para inicializar un objeto Libro a partir de un objeto DatosLibro.
    // - Extrae y asigna atributos del registro DatosLibro a los campos específicos de Libro.
    // - Se procesan propiedades complejas como formatos, convirtiéndolas a cadenas.
    public Libro(DatosLibro datosLibro) {
        this.titulo = datosLibro.titulo();
        this.lenguaje = datosLibro.lenguaje();
        this.poster = String.valueOf(datosLibro.formats().poster());
        this.libroElectronico = String.valueOf(datosLibro.formats().libroElectronico()) ;
        this.numeroDeDescargas = datosLibro.numeroDeDescargas();
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLenguaje() {
        return lenguaje;
    }
    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getLibroElectronico() {
        return libroElectronico;
    }
    public void setLibroElectronico(String libroElectronico) {
        this.libroElectronico = libroElectronico;
    }

    public Double getNumeroDeDescargas() {
        return numeroDeDescargas;
    }
    public void setNumeroDeDescargas(Double numeroDeDescargas) {
        this.numeroDeDescargas = numeroDeDescargas;
    }

    public List<Autor> getAutores() {
        return autores;
    }
    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    // Método toString sobrescrito para proporcionar una representación textual del objeto Libro.
    @Override
    public String toString() {
        return  
                ">>>>>>>>>>>>>>>>>>>>>>>>>>>> LIBRO <<<<<<<<<<<<<<<<<<<<<<<<<<<\n" +
                " titulo=" + titulo + "\n" +
                ", lenguaje=" + lenguaje + "\n" +
                ", poster=" + poster + "\n" +
                ", libroElectronico=" + libroElectronico + "\n" +
                ", numeroDeDescargas=" + numeroDeDescargas + "\n" +
                " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>><><<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n";
    }
}
