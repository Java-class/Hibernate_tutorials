package entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
/*@Cacheable
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)*/
public class Gender 
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String gendertitle;
	
	@OneToMany(mappedBy="gender")
	private Collection<Member> member=new ArrayList<Member>();
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Collection<Member> getMember() {
		return member;
	}
	public void setMember(Collection<Member> member) {
		this.member = member;
	}

	public String getGendertitle() {
		return gendertitle;
	}
	public void setGendertitle(String gendertitle) {
		this.gendertitle = gendertitle;
	}
		
}
