

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
		
		
		Book exampleBook = new Book();
		//b.setTitle("Java_programming");
		//exampleBook.setAuthor("rankuhi");
		exampleBook.setTitle("Programming");
		exampleBook.setId(2);
		
		
		
//		BookCategory bc =new BookCategory();
//		bc.setBookCategory("Programming");
//		
//		b.setBc(bc);*/
		
		
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		
		Example example =Example.create(exampleBook).enableLike(MatchMode.END);
		
		Criteria cr = session.createCriteria(Book.class);
		//cr.add(Restrictions.between("id", 1, 5));
		//cr.setProjection(Projections.count("id"));
		//cr.setProjection(Projections.max("id"));
		//cr.setProjection(Projections.property("title"));
		//cr.setProjection(Projections.distinct(Projections.property("author")));
		cr.add(example);
		
		
		//Criterion cond1 = Restrictions.eq("author","rankuhi");
		//Criterion cond2 = Restrictions.between("id",110,120);
		//Criterion or = Restrictions.or(cond1,cond2);
		
	//	cr.add(Restrictions.eq("author","Mostafa"));
		
		//cr.add(Restrictions.between("id",110,120));
		
	/*	cr.add(cond1);
		cr.add(cond2);*/
		//cr.add(Restrictions.or(cond1, cond2));
		
		
		//cr.add(cond1).add(cond2);


		
		//cr.add(Restrictions)
		
		
		//Criterion like = Restrictions.like("title","%programming%");
		//Criterion ilike = Restrictions.gt("id", 200);
		
		//cr.add(ilike);
		//cr.set
		
		
		
		//cr.addOrder(Order.desc("id"));
		List<Book> books = cr.list();
		
		
		
		
		
		
		
		
		
		//int idValue=6;  /// input by user   /// SQL injection
		
		///String hql = "from Book where id=:idvalue  or title=:titlevalue";
		
		//String hql = "delete Book where id>:idvalue";
		
		//String hql ="update Book set title=:titlevalue where id=:idvalue";
		
		//String hql ="select title from Book";
		///Query q = session.createQuery(hql);
		
		//Query  q =session.getNamedQuery("bookbyId");
		//q.setInteger(0, 25);
		//q.setParameter("idvalue", 80);
		//List<Book> books =  q.list();
	
		//q.setInteger(0, Integer.parseInt(idValue));
		//q.setParameter("idvalue",idValue);
		//q.setParameter("titlevalue", "new title");
		//q.executeUpdate();
		//q.setParameter("titlevalue", "Book_title 37");
		
		//String sql = "SELECT * FROM book  b JOIN bookcategory bc ON b.bc_id=bc.id";
		//String sql = "select * from book where id =:idvalue";
		//SQLQuery sqlquery=session.createSQLQuery(sql);
		///SQLQuery sqlquery =session.getNamedNativeQuery("join");
		//sqlquery.addEntity(Book.class);
		///sqlquery.setParameter("idvalue",1);
		//List<Book> books = sqlquery.list();
 		
		
	//	Book b = session.get(Book.class,1);
		
		
		
		
		
		/*q.setFirstResult(50);
		q.setMaxResults(10);*/
		
		//List<String> booktitles = q.list();
		
		
		
		
		
	/*	for (int i = 0;i<100;i++)
		{
			Book b = new Book();
			b.setAuthor("Book_author "+i);
			b.setTitle("Book_title "+i);
			session.save(b);
		}*/
		tx.commit();
		session.close();
		
		//System.out.println(n);
		
//		
	for(Book b:books)
	{
		System.out.println(b.toString());
	}
		
		//System.out.println(b.toString());
		
		
		
	
		
	}

}
