package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class sfInjector
{

	private SessionFactory sessionFactory;
	private Session session;
	
	public sfInjector(){
		super();
	}
	
	public Session getSession()
	{
		if(session==null)
		{
			sessionFactory = new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
			this.session = sessionFactory.openSession();
		}
		else /// if current session is existed 
			this.session=sessionFactory.getCurrentSession(); 
		
		return session;
		
	}
}
