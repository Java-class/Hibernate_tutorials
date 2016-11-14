package service;

import java.util.List;

import dao.GenderDao;
import dao.GenderDaoImpl;
import dao.FoodDaoImpl;
import entity.Gender;

public class GenderServiceImpl implements GenderService 
{

private GenderDao genderDao;
	
	
	public GenderServiceImpl()
	{
		this.genderDao = new GenderDaoImpl();
	}
	
	
	
	
	@Override
	public Gender Add(Gender f) {
		
		
		/// check semantics and business rules // Exception handling
		genderDao.Insert(f);
		
		return f;
	}

	@Override
	public void Remove(Gender f) 
	{
	
		genderDao.Delete(f);
	}

	@Override
	public Gender Edit(Gender f) {
		genderDao.Update(f);
		
		return f;
	}

	@Override
	public List<Gender> getAll(Gender f) 
	{
		return genderDao.selectAll();
	}




	@Override
	public Gender getGender(int id) {
		return genderDao.getEntity(id);
	}
	
	
}
