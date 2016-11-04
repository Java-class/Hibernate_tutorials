package entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="tbl_user", schema="myschema")
public class User 
{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pk")
	private Integer id;
	//@Column(unique=true , nullable=false)
	private String userName;
	
	//@Lob
	private String details;
	
	
	/// not mapped in DB
	@Transient
	private String secret;
	
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date joinedDate;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", details=" + details + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	
	
}
