package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;


public interface GenericDao<entitytype ,PK extends Serializable> {
	
	
	public entitytype Insert(entitytype t);
	public void Delete(entitytype t);
	public entitytype Update( entitytype t);
	public List<entitytype> selectAll();
	
	
	////
	public entitytype getEntity(int id);
	
	
	

}
