package SecondStrategy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
//@Component
public class MemberDaoJpaImpl
{

    
	@PersistenceUnit //@Autowired is working but not sure in single transaction , same entity manager 
    private EntityManagerFactory entityManagerFactory;

    public void save(Member member) 
    {
        EntityManager entityManager = entityManagerFactory
                .createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(member);
        transaction.commit();
        entityManager.close();
    }
}
