package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food 
{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String foodName;
	private String basePrice;
	
	
	
	
	@Override
	public String toString() {
		return "Food [id=" + id + ", foodName=" + foodName + ", basePrice=" + basePrice + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(String basePrice) {
		this.basePrice = basePrice;
	}
	
}
