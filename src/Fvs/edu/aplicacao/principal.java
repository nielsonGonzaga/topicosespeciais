package Fvs.edu.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class principal {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("topicos-fvs");
		
		EntityManager em = emf.createEntityManager(); 

	}

}
