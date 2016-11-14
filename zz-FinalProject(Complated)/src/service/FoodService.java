package service;

import java.util.List;

import entity.Food;

public interface FoodService 
{
	public Food Add(Food p) throws Exception;
	public Food Update(Food p);
	public void Remove(int id);
	public List<Food> getAll();
	
	public Food getFood(int id);
	
	
}
