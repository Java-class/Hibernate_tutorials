package dao;

import java.util.List;

import entity.Gender;

public interface GenderDao 
{

	public Gender Insert(Gender f);
	public void Delete(Gender f);
	public Gender Update(Gender f);
	public List<Gender> selectAll();
	
	
	////
	public Gender getEntity(int id);
	
	
}
