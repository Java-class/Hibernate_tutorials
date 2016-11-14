package dao;

import java.util.List;

import org.hibernate.Session;

import entity.Food;

public interface FoodDao 
{
	public Food Insert(Food f);
	public void Delete(Food f);
	public Food Update(Food f);
	public List<Food> selectAll();
	
	
	////
	public Food getEntity(int id);
	
	
	
	
}
