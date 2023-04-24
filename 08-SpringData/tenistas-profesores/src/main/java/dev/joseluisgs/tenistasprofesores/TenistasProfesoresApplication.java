package dev.joseluisgs.tenistasprofesores;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Si quieres hacer un proyecto con Spring Boot, lo primero que tienes que hacer es crear una clase
 * con la anotación @SpringBootApplication, que es la que indica que es una aplicación Spring Boot.
 * Si quieres que tu aplicación haga algo despues de arrancar todo el sistema de Spring, puedes implementar la interfaz
 * CommandLineRunner y sobreescribir el método run.
 */

@SpringBootApplication
@EnableCaching // Habilitamos el caché
@EnableJpaAuditing // Habilitamos la auditoría, idual para el tiempo
public class TenistasProfesoresApplication implements CommandLineRunner {
    // Por si quiero cargar los datos, aunque prefiero por script!!
    // @Autowired
    // RaquetasRepository raquetasRepository;

    // El método main es el punto de entrada de la aplicación, no es necesario que lo modifiques
    public static void main(String[] args) {
        SpringApplication.run(TenistasProfesoresApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Aquí puedes poner el código que quieras que se ejecute al arrancar la aplicación
        System.out.println("Hola mundo desde Spring Boot! 👋");
        // Podriamos cargar los datos desde aquí!! pero no uses el script!!!
        // raquetasRepository.saveAll(RaquetasFactory.getRaquetasDemoData().values());

    }
}
