

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


public class test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		
		
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx= session.beginTransaction();
		Query q = session.createQuery("from Book where id=3");
		q.setCacheable(true);
		List<Book> books =q.list(); 
		//Book book = session.get(Book.class, 3);
		//book.setTitle("update book title");
		//System.out.println(book.toString());
		//book.setTitle("updated title");
		
		tx.commit();
		session.close();
		
		
		Session newsession =sf.openSession();
		newsession.beginTransaction();
		newsession.createQuery("from Book where id=3").setCacheable(true).list();
	/*	q2.setCacheable(true);
		List<Book> newbooks =q2.list(); */
		
//		Book otherbook = newsession.get(Book.class, 3);
//		System.out.println(otherbook.toString());
		
		newsession.getTransaction().commit();
		newsession.close();
		
		
			
		
	
		
	}

}
