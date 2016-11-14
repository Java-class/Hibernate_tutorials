package service;

import java.util.List;

import entity.Member;

public interface MemberService 
{
	public Member Add(Member p) throws Exception;
	public Member Update(Member p);
	public void Remove(int id);
	public List<Member> getAll();
	
}
