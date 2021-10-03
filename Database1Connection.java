package db1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database1Connection 
{
	public static Connection getConnectedtoDatabase()
	{
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/me_project","root","root");
		}
	catch(Exception ex)
		{
		ex.printStackTrace();
		}
		return conn;
	}
}
