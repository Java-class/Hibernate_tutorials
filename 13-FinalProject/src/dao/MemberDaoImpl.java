package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Member;

public class MemberDaoImpl  extends GenericDaoImpl<Member, Integer> implements MemberDao
{

	/*
	@Override
	public Member Insert(Member f) 
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
	public void Delete(Member f) 
	{
	
		
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		session.delete(f);
		tx.commit();
		session.close();
		
		
	}

	@Override
	public Member Update(Member f) 
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
	public List<Member> selectAll() {
		List<Member> foods = new ArrayList<>();

		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		
		foods = session.createQuery("from Member").list();
		
		tx.commit();
		session.close();	
		return foods;
	}

	@Override
	public Member getMember(int id)
	{
		Member result = null;
		SessionFactory sf=new Configuration().configure("ProjectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx= session.beginTransaction();
		result = session.get(Member.class,id);
		tx.commit();
		session.close();
		return result;
	}*/

	
	
}
