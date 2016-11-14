package dao;

import java.util.List;

import entity.Member;

public interface MemberDao 
{


	public Member Insert(Member f);
	public void Delete(Member f);
	public Member Update(Member f);
	public List<Member> selectAll();
	
	
	////
	public Member getEntity(int id);
	
}
