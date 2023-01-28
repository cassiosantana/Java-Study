package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Person;

public class Program {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emf.createEntityManager();
		
//		Unable to remove untracked entities outside transaction context
//		Person p = new Person(2, null, null);
//		em.remove(p);
		
//		Monitored but not in transaction
//		Person p = em.find(Person.class, 2);
//		em.remove(p);

		/*
		 * Monitored entities are those newly inserted or fetched from the database 
		 * and the EntityManager has not yet been closed. 
		 * It is only possible to remove entities that are monitored and 
		 * within transactions.
		 */
		Person p = em.find(Person.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Done!");
		em.close();
		emf.close();
	}
}
