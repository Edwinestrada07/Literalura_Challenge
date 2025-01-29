package com.aluracursos.Literalura_Challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aluracursos.Literalura_Challenge.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{
}
