package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Food;

public class FoodDaoImpl extends GenericDaoImpl<Food, Integer>  {
/*
	@Override
	public Food Insert(Food f) 
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
	public void Delete(Food f) 
	{
	
		
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		session.delete(f);
		tx.commit();
		session.close();
		
		
	}

	@Override
	public Food Update(Food f) 
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
	public List<Food> selectAll() {
		List<Food> foods = new ArrayList<>();

		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		foods = session.createQuery("from Food").list();
		
		tx.commit();
		session.close();	
		return foods;
	}

	@Override
	public Food getFood(int id)
	{
		Food result = null;
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		result = session.get(Food.class,id);
		tx.commit();
		session.close();
		return result;
	}*/

}
