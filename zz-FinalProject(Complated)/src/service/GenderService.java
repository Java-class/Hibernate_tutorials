package service;

import java.util.List;

import entity.Gender;

public interface GenderService 
{
	public Gender Add(Gender p) throws Exception;
	public Gender Update(Gender p);
	public void Remove(int id);
	public List<Gender> getAll();
	
	public Gender getGender(int id);
}
