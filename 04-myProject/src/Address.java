import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
	
	@Column(name="street_name")
	private String street;
	
	@Column(name="city_name")
	private String city;
	
	@Column(name="zipcode_name")
	private String zipcode;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
