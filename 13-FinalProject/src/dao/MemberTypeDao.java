package dao;

import java.util.List;

import entity.MemberType;

public interface MemberTypeDao 
{

	public MemberType Insert(MemberType f);
	public void Delete(MemberType f);
	public MemberType Update(MemberType f);
	public List<MemberType> selectAll();
	
	
	////
	public MemberType getEntity(int id);
	
	
}
