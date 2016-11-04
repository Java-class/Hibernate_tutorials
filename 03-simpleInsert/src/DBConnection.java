import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	private static final String DB_DRIVER = "org.postgresql.Driver";
	private static final String DB_CONNECTION = "jdbc:postgresql://127.0.0.1:5433/postgres";
	private static final String DB_USER = "postgres";
	private static final String DB_PASSWORD = "123";
	
	
	private static Connection connection = null;
	
	public static Connection getConnection()
	{
		if (connection != null)
		{
			return connection;
		}
		else
		{
			try
			{
				Class.forName(DB_DRIVER);
				connection = DriverManager.getConnection(DB_CONNECTION , DB_USER,DB_PASSWORD);
			}
			catch (Exception ee)
			{
				System.out.println("Err----");
				ee.printStackTrace();
			}
			return connection;
		}
	}
	
	
	
}
