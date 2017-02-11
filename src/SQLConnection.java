import java.sql.*;
public class SQLConnection {

	private static Connection connection;
	static{
	try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		connection=DriverManager.getConnection("jdbc:sqlserver://localhost;database=SFE;integratedsecurity=true","***","******");
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	}
	public static Connection getConnection()
	{
		return connection;
	}
	
}
