package FirstStrategy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				FirstStrategy.JPAconfig.class);
		
		
		EntityManagerFactory entityManagerFactory =  applicationContext
				.getBean(EntityManagerFactory.class);
		EntityManager entityManager = entityManagerFactory
				.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		Member member=new Member();// applicationContext.getBean(Member.class);
		member.setName("firstname");
		member.setFamily("firstfamily");

		entityManager.persist(member);

		transaction.commit();
		entityManager.close();

	}

}