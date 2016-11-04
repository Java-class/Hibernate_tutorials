

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class test
{

	public static void main(String[]args)
	{
		
		
		Member m=new Member();
		//m.setId(5);
		m.setName("Mostafa");
		m.setFamily("Anbarmoo");
		
		
		
		SessionFactory sf=new Configuration().configure("/ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		session.save(m);
		tx.commit();
		session.close();
		
		
		
		
		
	}
	
}
