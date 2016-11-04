

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Member;

public class test
{

	public static void main(String[]args)
	{
		
		
		Member m=new Member();
		//m.setId(1);
		m.setName("Mostafa");
		m.setFamily("Anbarmoo");
		
		
		
		SessionFactory sf=new Configuration().configure("/config/ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		session.save(m);
		tx.commit();
		session.close();
		
		
		
		
		
	}
	
}
