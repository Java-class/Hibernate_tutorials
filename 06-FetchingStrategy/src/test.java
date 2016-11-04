

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class test {

	public static void main(String[] args)
	{
		Member m= new Member();
		m.setName("Ali");
		m.setFamily("Mahdavi");
		
		
		
	
	
		
		
		
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.getCurrentSession();
		
		Transaction tx= session.beginTransaction();
		/*type = session.get(MemberType.class,1);
		
		type = session.load(MemberType.class, 100); //should handle exception
		m.setType(type);*/
		session.save(m);

		
		tx.commit();
		session.close();
		
	/*	System.out.println(m.toString());*/
		
	}

}
