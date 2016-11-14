package dao;

import java.io.Serializable;
import java.util.List;


public interface GenericDao<entitytype , PK extends Serializable > {

	public entitytype Insert(entitytype type ); //// insert entity into DB
	
	public entitytype Update(entitytype type ); ////update entity in DB
	
	public void Delete(PK id ); //// delete object from DB 
	
	public List<entitytype> selectAll(); // get All records from DB
	
	public entitytype getEntity(PK id); /// just for get one entity from DB
}
