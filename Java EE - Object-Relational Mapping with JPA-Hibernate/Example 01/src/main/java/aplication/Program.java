package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Person;

public class Program {

	public static void main(String[] args) {
		
		Person p1 = new Person(null, "Carlos da Silva", "carlos@gmail.com");
		Person p2 = new Person(null, "Joaquim Torres", "joaquim@gmail.com");
		Person p3 = new Person(null, "Ana Maria", "ana.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Done!");
		em.close();
		emf.close();
	}

}
