package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Person;

public class Program {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emf.createEntityManager();
		
		// Querying the database
		Person p = em.find(Person.class, 1);
		System.out.println(p);
		
		System.out.println("Done!");
		em.close();
		emf.close();
	}

}
