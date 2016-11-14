package service;

import java.util.List;

import entity.MemberType;

public interface MemberTypeService
{

	public MemberType Add(MemberType p) throws Exception;
	public MemberType Update(MemberType p);
	public void Remove(int id);
	public List<MemberType> getAll();
	
	
	public MemberType getMemberType(int id);

}


