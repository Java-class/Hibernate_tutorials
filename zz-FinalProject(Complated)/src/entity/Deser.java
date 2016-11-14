package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deser
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String desername;
	private String baseprice;

	
	public String getDesername() {
		return desername;
	}
	public void setDesername(String desername) {
		this.desername = desername;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getBaseprice() {
		return baseprice;
	}
	public void setBaseprice(String baseprice) {
		this.baseprice = baseprice;
	}
	
	
	
}
