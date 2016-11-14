package service;

import java.util.List;

import entity.Deser;

public interface DeserService
{
	public Deser Add(Deser p) throws Exception;
	public Deser Update(Deser p);
	public void Remove(int id);
	public List<Deser> getAll();
	
}
