package com.aluracursos.Literalura_Challenge.model;

public class Libro {
    private String titulo;
    private String lenguaje;
    private String poster;
    private String libroElectronico;
    private Double numeroDeDescargas;
    
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
