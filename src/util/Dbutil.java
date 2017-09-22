package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Dbutil {
	
	private static String driver="oracle.jdbc.OracleDriver";
	private static String password="tiger";
	private static String URL="jdbc:oracle:thin:@localhost:1521:XE";
	private static String user="SYSTEM";
	
	public static void closeConnection(Connection con)
	{
		if(con!=null)
		{
			try
			{
				con.close();
			} 
			catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	public static void closeStatement(PreparedStatement ps)
	{
		if(ps!=null)
		{
			try
			{
				ps.close();
			} 
			catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	public static Connection getconnection()
	{
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(URL, user, password);
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return con;
		
	}
	
}

