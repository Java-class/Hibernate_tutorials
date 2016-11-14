package service;

import java.util.List;

import org.hibernate.Session;

import dao.GenderDao;
import dao.sfInjector;
import entity.Gender;

public class GenderServiceImpl implements GenderService
{
	private GenderDao genderDao;
	private sfInjector sf;
	private Session session;
	
	public GenderServiceImpl()
	{
		genderDao=new GenderDao();
		sf = new sfInjector();
		this.session=sf.getSession();
		genderDao.setSession(session);
	}
	
	
	
	@Override
	public Gender Add(Gender b) throws Exception {
		session.getTransaction().begin();
		try{
				genderDao.Insert(b);
				session.getTransaction().commit();
				return b;
			}
		catch(Exception e){
			session.getTransaction().rollback();
			throw new Exception("Error,Do not Inserted!!");
		}
		
	
	}

	@Override
	public Gender Update(Gender b) {
		session.getTransaction().begin();
		try{
			Gender newGender = genderDao.getEntity(b.getId());
			session.update(newGender);
			session.getTransaction().commit();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
		
		return b;
	}

	@Override
	public void Remove(int id) {
		session.getTransaction().begin();
		
		try{
			genderDao.Delete(id);
			session.getTransaction().commit();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
	}

	@Override
	public List<Gender> getAll() {
		
		List<Gender> genders=null;
		session.getTransaction().begin();
		genders=genderDao.selectAll();
		session.getTransaction().commit();
		return genders;
	}

	
	public Gender getGender(int id){
		return genderDao.getEntity(id);
	}
	
	
	
	
	
}
