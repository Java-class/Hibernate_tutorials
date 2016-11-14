package service;

import java.util.List;

import org.hibernate.Session;

import dao.FoodDao;
import dao.sfInjector;
import entity.Food;

public class FoodServiceImpl implements FoodService
{

	private FoodDao foodDao;
	private sfInjector sf;
	private Session session;
	
	public FoodServiceImpl()
	{
		foodDao=new FoodDao();
		sf = new sfInjector();
		this.session=sf.getSession();
		//foodDao.setSession(session);
	}
	
	@Override
	public Food Add(Food b) throws Exception {
		session.getTransaction().begin();
		try{
				foodDao.setSession(session);
				foodDao.Insert(b);
				session.getTransaction().commit();
				return b;
			}
		catch(Exception e){
			session.getTransaction().rollback();
			throw new Exception("Error,Do not Inserted!!");
		}
		/*finally
		{
			session.close();
		}*/
	
	}

	@Override
	public Food Update(Food newFood) {
		session.getTransaction().begin();
		try{
			foodDao.setSession(session);
			session.update(newFood);
			session.getTransaction().commit();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
		
		return newFood;
	}

	@Override
	public void Remove(int id) {
		session.getTransaction().begin();
		
		try{
			foodDao.setSession(session);
			foodDao.Delete(id);
			session.getTransaction().commit();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
	}

	@Override
	public List<Food> getAll() {
		
		List<Food> foods=null;
		foodDao.setSession(session);
		session.getTransaction().begin();
		foods=foodDao.selectAll();
		session.getTransaction().commit();
		return foods;
	}
	
	public Food getFood(int id)
	{
		return foodDao.getEntity(id);
	}
		
}
