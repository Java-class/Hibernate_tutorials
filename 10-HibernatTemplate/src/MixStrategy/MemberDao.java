package MixStrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Member;

//@Component
@Repository
@Transactional
public class MemberDao 
{
	//@Autowired
	@SuppressWarnings("deprecation")
	HibernateTemplate template;
	
	@Autowired 
	public void setTemplate(HibernateTemplate template) 
	{
		this.template = template;
	
	}
	
	public void saveMember(Member member)
	{
		template.save(member);
		
	}
	
	public void updateMember(Member member)
	{
		template.update(member);
	}
	
	public void deleteMember(int memberId)
	{
		Member member=template.get(Member.class, memberId);
		template.delete(member);
	}
}
