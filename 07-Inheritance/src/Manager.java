import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "modir")
public class Manager extends Employee
{
	private String role;
	private int manager_bonus;
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getManager_bonus() {
		return manager_bonus;
	}

	public void setManager_bonus(int manager_bonus) {
		this.manager_bonus = manager_bonus;
	}
	
}
