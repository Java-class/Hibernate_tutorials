package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.MemberType;

public class MemberTypeDaoImpl extends GenericDaoImpl< MemberType, Integer> implements MemberTypeDao
{

	/*@Override
	public MemberType Insert(MemberType f) 
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
	public void Delete(MemberType f) 
	{
	
		
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		session.delete(f);
		tx.commit();
		session.close();
		
		
	}

	@Override
	public MemberType Update(MemberType f) 
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
	public List<MemberType> selectAll() {
		List<MemberType> foods = new ArrayList<>();

		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		foods = session.createQuery("from MemberType").list();
		
		tx.commit();
		session.close();	
		return foods;
	}

	@Override
	public MemberType getType(int id)
	{
		MemberType result = null;
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		result = session.get(MemberType.class,id);
		tx.commit();
		session.close();
		return result;
	}
	*/
	
}
