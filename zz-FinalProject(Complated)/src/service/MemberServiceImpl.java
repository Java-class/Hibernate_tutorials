package service;

import java.util.List;

import org.hibernate.Session;

import dao.MemberDao;
import dao.sfInjector;
import entity.Member;

public class MemberServiceImpl  implements MemberService
{

	private MemberDao memberDao;
	private sfInjector sf;
	private Session session;
	
	public MemberServiceImpl()
	{
		memberDao=new MemberDao();
		sf = new sfInjector();
		this.session=sf.getSession();
		memberDao.setSession(session);
	}
	
	
	
	@Override
	public Member Add(Member b) throws Exception {
		session.getTransaction().begin();
		try{
				memberDao.Insert(b);
				session.getTransaction().commit();
				return b;
			}
		catch(Exception e){
			session.getTransaction().rollback();
			throw new Exception("Error,Do not Inserted!!");
		}
		
	}

	@Override
	public Member Update(Member b) {
		session.getTransaction().begin();
		try{
			Member newDeser = memberDao.getEntity(b.getId());
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
			memberDao.Delete(id);
			session.getTransaction().commit();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
	}

	@Override
	public List<Member> getAll() {
		
		List<Member> types=null;
		session.getTransaction().begin();
		types=memberDao.selectAll();
		session.getTransaction().commit();
		return types;
	}
	
	
}
