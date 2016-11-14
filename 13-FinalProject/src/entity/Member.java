package entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
/*@Cacheable
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)*/
public class Member
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String family;
	private String taghziyeno;
	private String memberno;
	private String details;
	private String startdate; 
	private String enddate;
	
	@ManyToOne
	private MemberType memtype;
	
	public MemberType getMemtype() {
		return memtype;
	}
	public void setMemtype(MemberType memtype) {
		this.memtype = memtype;
	}
	
	@ManyToOne
	private Gender gender;
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	
	public String getTaghziyeno() {
		return taghziyeno;
	}
	public void setTaghziyeno(String taghziyeno) {
		this.taghziyeno = taghziyeno;
	}
	
	public String getMemberno() {
		return memberno;
	}
	public void setMemberno(String memberno) {
		this.memberno = memberno;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
}
