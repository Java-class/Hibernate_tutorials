

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class test {

	public static void main(String[] args)
	{
		
		
		Employee em = new Employee();
		em.setName("Ali");
		em.setBase_salary(800000);
		
		
		Manager m = new Manager();
		m.setName("Mostafa");
		m.setBase_salary(1500000);
		m.setRole("Project_manager");
		m.setManager_bonus(2000000);
		
		Programmer p = new Programmer();
		p.setName("Mohsen");
		p.setBase_salary(1000000);
		p.setSkills("Java_programming");
		p.setProgrammer_bonus(1000000);
		
		
		
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(em);
		session.save(m);
		session.save(p);
		
		tx.commit();
		session.close();
		
	
		
	}

}
