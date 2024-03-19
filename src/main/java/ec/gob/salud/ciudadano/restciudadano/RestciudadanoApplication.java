package ec.gob.salud.ciudadano.restciudadano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import ec.gob.salud.ciudadano.web.rest.InfoCiudadano;


@SpringBootApplication
@ComponentScan(basePackageClasses = InfoCiudadano.class)
public class RestciudadanoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestciudadanoApplication.class, args);
	}

}
