package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Gender;

public class GenderDaoImpl extends GenericDaoImpl<Gender, Integer> implements GenderDao 
{
/*
	@Override
	public Gender Insert(Gender f) 
	{
		
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		session.saveOrUpdate(f);
		tx.commit();
		session.close();
		return f;
	}

	@Override
	public void Delete(Gender f) 
	{
	
		
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		session.delete(f);
		tx.commit();
		session.close();
		
		
	}

	@Override
	public Gender Update(Gender f) 
	{
	
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		session.update(f);
		tx.commit();
		session.close();
		
		return f;
		
		
		
	}

	@Override
	public List<Gender> selectAll() {
		List<Gender> genders = new ArrayList<>();

		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		genders = session.createQuery("from Gender").list();
		
		tx.commit();
		session.close();	
		return genders;
	}

	@Override
	public Gender getEntity(int id)
	{
		Gender result = null;
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		result = session.get(Gender.class,id);
		tx.commit();
		session.close();
		return result;
	}*/
	
	
	
}
