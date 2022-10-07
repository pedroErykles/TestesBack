package gov.edu.anm.prematricula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import gov.edu.anm.prematricula.models.Ano;
import gov.edu.anm.prematricula.models.AnoCompleto;
import gov.edu.anm.prematricula.models.AnoIncompleto;
import gov.edu.anm.prematricula.models.Bimestre;
import gov.edu.anm.prematricula.models.Historico;
import gov.edu.anm.prematricula.models.Materia;

@SpringBootApplication
public class PreMatriculaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PreMatriculaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
