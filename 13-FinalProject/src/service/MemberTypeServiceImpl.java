package service;

import java.util.List;

import dao.MemberTypeDao;
import dao.MemberTypeDaoImpl;
import dao.FoodDaoImpl;
import entity.MemberType;

public class MemberTypeServiceImpl  implements MemberTypeService
{

	
	private MemberTypeDao memberTypeDao;
	
	
	public MemberTypeServiceImpl()
	{
		this.memberTypeDao = new MemberTypeDaoImpl();
	}
	
	
	
	
	@Override
	public MemberType Add(MemberType f) {
		
		
		/// check semantics and business rules // Exception handling
		memberTypeDao.Insert(f);
		
		return f;
	}

	@Override
	public void Remove(MemberType f) 
	{
	
		memberTypeDao.Delete(f);
	}

	@Override
	public MemberType Edit(MemberType f) {
		memberTypeDao.Update(f);
		
		return f;
	}

	@Override
	public List<MemberType> getAll(MemberType f) {
		return memberTypeDao.selectAll();
	}




	@Override
	public MemberType getType(int id) {
		return memberTypeDao.getEntity(id);
	}
	
	
}
