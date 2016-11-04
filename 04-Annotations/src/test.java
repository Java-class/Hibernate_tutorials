
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.User;

public class test {

	public static void main(String[] args)
	{
		User user = new User();
		//user.setId(2);
		user.setUserName("Ali");
		user.setSecret("top secret");
		user.setJoinedDate(new Date());
		//user.setDetails("Hibernate ORM (Hibernate in short) is an object-relational mapping framework for the Java language. It provides a framework for mapping an object-oriented domain model to a relational database. Hibernate solves object-relational impedance mismatch problems by replacing direct, persistent database accesses with high-level object handling functions.Hibernate is free software that is distributed under the GNU Lesser General Public License 2.1.Hibernate's primary feature is mapping from Java classes to database tables; and mapping from Java data types to SQL data types. Hibernate also provides data query and retrieval facilities. It generates SQL calls and relieves the developer from manual handling and object conversion of the result set.");
		
		
		
		SessionFactory sf=new Configuration().configure("/config/ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		
		
		
		
		//System.out.println(user.toString());
	}

}
