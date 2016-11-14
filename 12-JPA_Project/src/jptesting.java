import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Member;

public class jptesting {

	public static void main(String[] args) 
	{

		Member m = new Member();
		m.setName("Ali");
		m.setFamily("Rezai");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_ProjectPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(m);
		
		em.getTransaction().commit();
		em.close();
		
		

	}

}
