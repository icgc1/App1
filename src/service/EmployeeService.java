package service;

import java.util.ArrayList;

import bean.Employee;
import dao.EmployeeDao;

public class EmployeeService {
	
	public int addEmployee(Employee e)
	{
		int count=0;
		count=EmployeeDao.add(e);
		return count;
	}
	/*
	 * public int updateEmployee(int id,double sal)
	

	{
		int count=0;
		count=EmployeeDao.update(id, sal);
		return count;
		
	}
	public int deleteEmployee(int id)
	{
		return EmployeeDao.delete(id);
		
	}
	public Employee searchEmployee(int id)
	{
		return EmployeeDao.search(id);
	}
	*/
	public ArrayList<Employee> viewEmployees()
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		list=EmployeeDao.viewAllEmployees();
		return list;
		
	}
	

}
