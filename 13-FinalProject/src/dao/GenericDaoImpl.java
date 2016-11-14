package dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public abstract class GenericDaoImpl<entitytype,PK extends Serializable> implements GenericDao<entitytype,Serializable> 
{

	private Class<entitytype> classtype;
	private String className; //// for get name of entity class for HQL and ...
	
//	private sfInjector sf;
	private Session session;
	
	
	

	public void setSession(Session session) {
		this.session = session;
	}




	public GenericDaoImpl()
	{
		 Type t = getClass().getGenericSuperclass();
	     ParameterizedType pt = (ParameterizedType) t;
	     classtype = (Class<entitytype>) pt.getActualTypeArguments()[0];
	     String templateName = classtype.getName(); //Class name generate here include entity.classname it dos'nt useful for HQl
	     this.className= templateName.substring(templateName.lastIndexOf('.')+1,templateName.length());  
	    /* sf = new sfInjector();
	     this.session = sf.getSession();
	*/
	}
	
	
	
	
	@Override
	public entitytype Insert(entitytype t ) {

		/*SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();*/
		
		//Transaction tx= session.beginTransaction();
		session.saveOrUpdate(t);
		//tx.commit();
		//session.close();
		return t;
		
	}

	@Override
	public void Delete(entitytype t ) 
	{
		
		/*SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();*/
		Transaction tx= session.beginTransaction();
		session.delete(t);
		tx.commit();
		session.close();
	
	}

	@Override
	public entitytype Update(entitytype t) {

		/*SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		*/
		Transaction tx= session.beginTransaction();
		session.update(t);
		tx.commit();
		session.close();
		return t;		
	}

	@Override
	public List<entitytype> selectAll() {
		List<entitytype> result =new ArrayList<>();

		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx= session.beginTransaction();
		result =(List<entitytype>) session.createQuery("from " + className);
		tx.commit();
		session.close();
		return result;
	}

	@Override
	public entitytype getEntity(int id) {

		entitytype result = null;
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		result = session.get(classtype, id);
		tx.commit();
		session.close();
		return result;		
	}

}
