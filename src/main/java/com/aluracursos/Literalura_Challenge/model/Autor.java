package com.aluracursos.Literalura_Challenge.model;

public class Autor {
    private String nombre;
    private String fechaNacimiento;
    private String fechaDeceso;

    public Autor() {}
    
    // Constructor personalizado para inicializar un objeto Autor.
    // - Permite asignar el nombre explícitamente y mapear las fechas desde un objeto DatosAutor.
    public Autor(String nombre, DatosAutor a) {
        this.nombre = nombre;
        this.fechaNacimiento = a.fechaNacimiento();
        this.fechaDeceso = a.fechaDeceso();
    }

    // Getters y setters para los atributos de la clase Autor.
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
