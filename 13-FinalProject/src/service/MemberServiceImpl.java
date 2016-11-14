package service;

import java.util.List;

import dao.MemberDao;
import dao.MemberDaoImpl;
import dao.FoodDaoImpl;
import entity.Member;

public class MemberServiceImpl  implements MemberService
{

	private MemberDao memberDao;
	
	
	public MemberServiceImpl()
	{
		this.memberDao = new MemberDaoImpl();
	}
	
	
	
	
	@Override
	public Member Add(Member f) {
		
		
		/// check semantics and business rules // Exception handling
		memberDao.Insert(f);
		
		return f;
	}

	@Override
	public void Remove(Member f) 
	{
	
		memberDao.Delete(f);
	}

	@Override
	public Member Edit(Member f) {
		memberDao.Update(f);
		
		return f;
	}

	@Override
	public List<Member> getAll(Member f) {
		return memberDao.selectAll();
	}




	@Override
	public Member getMember(int id) {
		return memberDao.getEntity(id);
	}
	
}
