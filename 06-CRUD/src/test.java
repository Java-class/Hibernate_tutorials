import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test
{
	public static void main(String[]args)
	{
		
		
		Book book = new Book();
		/*book.setTitle("Java Programming");
		book.setAuthor("Mostafa"); */  /// transient
		
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		//book.setTitle("Hibernate");
		//session.save(book);
		
		
		book = session.get(Book.class,1);
		
		
		////// wait for user update book
		//session.update(book);
		
		//book.setTitle("after save by session");
		
		//book.setTitle("change again");
		
		
		
		//session.delete(book);
		//book.setAuthor("Ali");
		//session.update(book);
		
		//book.setTitle("Spring");
		tx.commit();
		session.close();
		
		/// edit information by User
		book.setTitle("Update by User");
		
		
		session=sf.getCurrentSession();
		
		tx= session.beginTransaction();
		
		
		
		tx.commit();
		session.close();
		
		
		
		
		
		
		//System.out.println(book.toString());
	}
}
