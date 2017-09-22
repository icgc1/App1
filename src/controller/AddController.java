package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import bean.Employee;

@WebServlet("/AddController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public AddController() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

int id=Integer.parseInt(request.getParameter("eid"));
String name=request.getParameter("ename");
float sal=Float.parseFloat(request.getParameter("esal"));
String addr=request.getParameter("eaddr");

Employee e=new Employee(id,name,sal,addr);



//EmployeeService es=new EmployeeService();
//es.addEmployee(e);

EmployeeDao ed=new EmployeeDao();
ed.add(e);


RequestDispatcher rd=request.getRequestDispatcher("home.jsp");

rd.include(request, response);



		}

}
