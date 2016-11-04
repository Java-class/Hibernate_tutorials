

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class test {

	public static void main(String[] args)
	{
		Member m= new Member();
		m.setName("Mostafa");
		m.setFamily("Anbarmoo");
		
		Address add=new Address();
		add.setStreet("Azadi");
		add.setCity("Tehran");
		add.setZipcode("123455145");
		
		
		Address add2=new Address();
		add2.setStreet("ValiAsr");
		add2.setCity("Tehran");
		add2.setZipcode("123455145");
		
		
		m.getAddress().add(add);
		m.getAddress().add(add2);
		
	
		
		
		
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		session.save(m);
		//session.save(add);
		//session.save(add2);
		
		
		tx.commit();
		session.close();
		
		
		
		
		//System.out.println(user.toString());
	}

}
