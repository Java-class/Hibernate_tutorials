package dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.query.Query;

import java.io.Serializable;

public abstract class GenericDaoImpl<entitytype,PK extends Serializable > implements GenericDao<entitytype,PK> 
{
	
	private Class<entitytype> classtype; /// for get type of entity class
	private String className; //// for get name of entity class for HQL and ...
	
	private Session session; 
	
	
	public void setSession(Session session) {
		this.session = session; ///// set the session from service layer
	}


	@SuppressWarnings("unchecked")
	public GenericDaoImpl()
	{
	   Type t = getClass().getGenericSuperclass();
       ParameterizedType pt = (ParameterizedType) t;
       classtype = (Class<entitytype>) pt.getActualTypeArguments()[0];
       String templateName = classtype.getName(); //Class name generate here include entity.classname it dos'nt useful for HQl
       this.className= templateName.substring(templateName.lastIndexOf('.')+1,templateName.length());  
	}
	
	
	@Override
	public entitytype Insert(entitytype t)
	{
		session.saveOrUpdate(t);
		return t;
	}
	
	@Override
	public void Delete(PK id)
	{
		session.delete(getEntity(id)); 
	}
	
	@Override
	public entitytype Update(entitytype newObject)
	{
		session.update(newObject);
		return newObject;
	}
	
	
	@Override
	public entitytype getEntity(PK id){
		return session.get(classtype,id);
		
	}
	
	
	@Override
	public List<entitytype> selectAll()
	{
		List<entitytype> result =null;
		Query query = session.createQuery("from " + this.className).setCacheable(true);//.setHint("org.hibernate.cacheable","true");
		result = query.getResultList();
		return result;
	}
	
}
