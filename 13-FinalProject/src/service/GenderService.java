package service;

import java.util.List;

import entity.Gender;

public interface GenderService
{


	public Gender Add(Gender f);
	public void Remove(Gender f);
	public Gender Edit(Gender f);
	public List<Gender> getAll(Gender f);
	
	
	
	////
	public Gender getGender(int id);
	
	
}
