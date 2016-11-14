package service;

import java.util.List;

import org.hibernate.Session;

import dao.FoodDao;
import dao.FoodDaoImpl;
import dao.FoodDao;
import dao.GenderDaoImpl;
import dao.GenericDao;
import dao.sfInjector;
import entity.Food;
import entity.Food;

public class FoodServiceImpl implements FoodService {
	
	private FoodDaoImpl foodDao;
	
	private sfInjector sf;
	private Session session;
	
	
	
	
	public FoodServiceImpl()
	{
		this.foodDao = new FoodDaoImpl();
		sf = new sfInjector();
		this.session = sf.getSession();
		foodDao.setSession(session);
		
	}
	
	
	
	
	@Override
	public Food Add(Food f) {
		
		/// check semantics and business rules // Exception handling
		
		session.getTransaction().begin();
		foodDao.Insert(f);
		session.getTransaction().commit();
		
		return f;
	}

	@Override
	public void Remove(Food f) 
	{
	
		foodDao.Delete(f);
	}

	@Override
	public Food Edit(Food f) {
		foodDao.Update(f);
		
		return f;
	}

	@Override
	public List<Food> getAll(Food f) 
	{
		return foodDao.selectAll();
	}




	@Override
	public Food getFood(int id) {
		return foodDao.getEntity(id);
	}
}
