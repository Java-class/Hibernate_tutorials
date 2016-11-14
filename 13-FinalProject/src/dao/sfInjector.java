package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class sfInjector 
{

	private SessionFactory sessionFactory;
	private Session session;
	
	public sfInjector()
	{
		super();
	}
	
	public Session getSession(){
		
		if(session==null)
		{
			sessionFactory  = new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
			session = sessionFactory.openSession();
		}
		else sessionFactory.getCurrentSession();
		
		return session;
		
		
		
	}
}
