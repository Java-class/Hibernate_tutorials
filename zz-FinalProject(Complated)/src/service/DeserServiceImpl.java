package service;

import java.util.List;

import org.hibernate.Session;

import dao.DeserDao;
import dao.sfInjector;
import entity.Deser;

public class DeserServiceImpl implements DeserService
{

	private DeserDao deserDao;
	private sfInjector sf;
	private Session session;
	
	public DeserServiceImpl()
	{
		this.deserDao=new DeserDao();
		sf = new sfInjector();
		this.session=sf.getSession();
		deserDao.setSession(session);
	}
	
	
	
	@Override
	public Deser Add(Deser b) throws Exception {
		session.getTransaction().begin();
		try{
				deserDao.Insert(b);
				session.getTransaction().commit();
				return b;
			}
		catch(Exception e){
			session.getTransaction().rollback();
			throw new Exception("Error,Do not Inserted!!");
		}
		
	
	}

	@Override
	public Deser Update(Deser b) {
		session.getTransaction().begin();
		try{
			Deser newDeser = deserDao.getEntity(b.getId());
			session.update(newDeser);
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
			deserDao.Delete(id);
			session.getTransaction().commit();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
	}

	@Override
	public List<Deser> getAll() {
		
		List<Deser> desers=null;
		session.getTransaction().begin();
		desers=deserDao.selectAll();
		session.getTransaction().commit();
		return desers;
	}

	
	
	
}
