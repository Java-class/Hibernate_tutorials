package service;

import java.util.List;

import entity.Member;

public interface MemberService 
{

	public Member Add(Member f);
	public void Remove(Member f);
	public Member Edit(Member f);
	public List<Member> getAll(Member f);
	
	
	
	////
	public Member getMember(int id);
	
}
