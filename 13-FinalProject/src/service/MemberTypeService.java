package service;

import java.util.List;

import entity.MemberType;

public interface MemberTypeService
{

	public MemberType Add(MemberType f);
	public void Remove(MemberType f);
	public MemberType Edit(MemberType f);
	public List<MemberType> getAll(MemberType f);
	
	
	
	////
	public MemberType getType(int id);
	
	
}
