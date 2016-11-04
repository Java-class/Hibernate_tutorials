import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
public class Member {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	private String name;
	private String family;
	
	/*@Embedded
	@AttributeOverrides({
	@AttributeOverride(column = @Column(name="home_street_name"), name = "street"),
	@AttributeOverride(column = @Column(name="home_city_name"), name = "city"),
	@AttributeOverride(column = @Column(name="home_zipcode_name"), name = "zipcode"),
	})
	private Address address;
	
	@Embedded
	private Address address2;
*/
	
	@ElementCollection
	@GenericGenerator(name = "gen", strategy = "native")
	@JoinTable(name="tbl_address" , joinColumns=@JoinColumn(name="fk_member"))
	@CollectionId(columns = { @Column(name="pk_address") }, generator = "gen", type = @Type(type="long"))
	private Collection<Address> addresses = new ArrayList<>();
	
	/*public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	/*public Address getAddress2() {
		return address2;
	}
	public void setAddress2(Address address2) {
		this.address2 = address2;
	}*/
	public Collection<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}
	
	
}
