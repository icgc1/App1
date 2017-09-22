package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;


@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public UpdateController() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int id=Integer.parseInt(request.getParameter("eid"));
Float sal=Float.parseFloat(request.getParameter("esal"));

new EmployeeDao().update(id,sal);

RequestDispatcher rd=request.getRequestDispatcher("home.jsp");

rd.include(request, response);
	}

}
