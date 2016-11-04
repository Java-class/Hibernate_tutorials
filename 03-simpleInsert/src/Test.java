
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Test
{
	
	
	public static void main(String []args)
	{
		
		Insert("Ali","Rezai");
	}
	
	
	
	
	
	public static void Insert(String name, String family)
	{
		try
		{
			PreparedStatement r = DBConnection.getConnection().prepareStatement(
					"insert into member(name,family)"
							+ "values (?,?);");
			//r.setInt(1, id);
			r.setString(1, name);
			r.setString(2, family);
			
			r.execute();
			
			System.out.println("Inserted Successfuly");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			System.out.println("Error!!");
		}
		
	}// End of Insert
	
	
	
}
