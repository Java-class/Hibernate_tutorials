package service;

import java.util.List;

import org.hibernate.Session;

import dao.MemberTypeDao;
import dao.sfInjector;
import entity.MemberType;

public class MemberTypeServiceImpl implements MemberTypeService{

	private MemberTypeDao membertypeDao;
	private sfInjector sf;
	private Session session;
	
	public MemberTypeServiceImpl()
	{
		membertypeDao=new MemberTypeDao();
		sf = new sfInjector();
		this.session=sf.getSession();
		membertypeDao.setSession(session);
	}
	
	
	
	@Override
	public MemberType Add(MemberType b) throws Exception {
		session.getTransaction().begin();
		try{
				membertypeDao.Insert(b);
				session.getTransaction().commit();
				return b;
			}
		catch(Exception e){
			session.getTransaction().rollback();
			throw new Exception("Error,Do not Inserted!!");
		}
		
	
	}

	@Override
	public MemberType Update(MemberType b) {
		session.getTransaction().begin();
		try{
			MemberType newDeser = membertypeDao.getEntity(b.getId());
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
			membertypeDao.Delete(id);
			session.getTransaction().commit();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
	}

	@Override
	public List<MemberType> getAll() {
		
		List<MemberType> types=null;
		session.getTransaction().begin();
		types=membertypeDao.selectAll();
		session.getTransaction().commit();
		return types;
	}
	
	
	
	public MemberType getMemberType(int id){
		return membertypeDao.getEntity(id);
	}

}
