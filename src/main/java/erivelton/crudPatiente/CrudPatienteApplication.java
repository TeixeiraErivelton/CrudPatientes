package erivelton.crudPatiente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CrudPatienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudPatienteApplication.class, args);
	}

}
