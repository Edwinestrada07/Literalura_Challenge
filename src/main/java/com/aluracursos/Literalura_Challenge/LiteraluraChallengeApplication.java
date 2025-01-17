package com.aluracursos.Literalura_Challenge;

import com.aluracursos.Literalura_Challenge.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LiteraluraChallengeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraChallengeApplication.class, args);
	}

    // Este método se ejecuta después de que Spring Boot termina de inicializar y arrancar el
	@Override
	public void run(String... args) throws Exception {
		// Ejecutar la clase principal que muestra el menú de opciones
		Principal principal = new Principal();
		principal.muestraElMenu();
	}

}
