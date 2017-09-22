package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.Dbutil;

import bean.Employee;

public class EmployeeDao {
public static int add(Employee e)
{
	int count=0;
	try
	{
		Connection con	=Dbutil.getconnection();
		PreparedStatement pst=con.prepareStatement("insert into Emple values(?,?,?,?)");
		pst.setInt(1, e.getEid());
		pst.setString(2, e.getEname());
		pst.setFloat(3, e.getEsal());
		pst.setString(4, e.getEaddr());
		
		count=pst.executeUpdate();	
	}
	catch(Exception e1)
	{
		e1.printStackTrace();
	}
	return count;
}

public static int update(int id,double sal){
	int status=0;
	Connection con=null;
	PreparedStatement ps=null;
	try
	{
		con=Dbutil.getconnection();
		 ps=con.prepareStatement("update Emple set esal=? where eid=?");

		ps.setDouble(1,sal);
		ps.setInt(2,id);
		
		status=ps.executeUpdate();
		
		con.close();
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	finally
	{
		Dbutil.closeConnection(con);
		Dbutil.closeStatement(ps);
	}
	return status;
}
public static int delete(int id){
	int status=0;
	Connection con=null;
	PreparedStatement ps=null;
	try
	{
		con=Dbutil.getconnection();
		 ps=con.prepareStatement("delete from Emple where eid=?");
		ps.setInt(1,id);
		status=ps.executeUpdate();
		
		
	}
	catch(Exception e1)
	{
		e1.printStackTrace();
	}
	finally
	{
		Dbutil.closeConnection(con);
		Dbutil.closeStatement(ps);
	}

	return status;
}

	public static ArrayList<Employee> viewAllEmployees(){
		ArrayList<Employee> list=new ArrayList<Employee>();
		PreparedStatement ps=null;
		Connection con=null;
		try{
		
			con=Dbutil.getconnection();
			 ps=con.prepareStatement("select * from Emple");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Employee e=new Employee(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getString(4));
				list.add(e);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			Dbutil.closeConnection(con);
			Dbutil.closeStatement(ps);
		}
		return list;

}
}
