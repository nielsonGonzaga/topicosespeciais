package Fvs.edu.br.topicos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Fvs.edu.br.topicos.domain.Categoria;
import Fvs.edu.br.topicos.repositorios.CategoriaRepository;

@SpringBootApplication
public class ProjetoTopicosEspeciaisApplication implements CommandLineRunner{

	@Autowired
	CategoriaRepository catRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoTopicosEspeciaisApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		catRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}
	
	
	
}
