package service;

import java.util.List;

import entity.Food;

public interface FoodService
{

	public Food Add(Food f);
	public void Remove(Food f);
	public Food Edit(Food f);
	public List<Food> getAll(Food f);
	
	
	
	////
	public Food getFood(int id);
	
}
