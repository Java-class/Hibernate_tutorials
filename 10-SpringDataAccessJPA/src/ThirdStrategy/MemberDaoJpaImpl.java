package ThirdStrategy;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MemberDaoJpaImpl implements MemberDao {
 
	@PersistenceContext //@Autowired
    private EntityManager entityManager;
    
    
     // or do like this
    /*@PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	*/
    
    
    @Override
    public void save(Member member) 
    {
           entityManager.persist(member);
    }
}
