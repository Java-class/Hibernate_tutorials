import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value="barnamehnevis")
public class Programmer extends Employee
{
	private String skills;
	private int programmer_bonus;
	
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public int getProgrammer_bonus() {
		return programmer_bonus;
	}
	public void setProgrammer_bonus(int programmer_bonus) {
		this.programmer_bonus = programmer_bonus;
	}
	
	
}
