import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class test {

	public static void main(String[] args)
	{
		
		
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx= session.beginTransaction();
		for(int i=0;i<10000;i++)
		{
			Book b = new Book();
			b.setTitle("book_title"+i);
			b.setAuthor("book_author");
			session.save(b); // still on session
			if(i%100==0){
			session.flush(); /// insert to DB before commit transaction
			session.clear(); /// session clean
			}
		}
		
		
		tx.commit();
		session.close();
		
			
	}

}
