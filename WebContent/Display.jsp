<%@ page import="bean.Employee" %>
   <%@ page import="dao.EmployeeDao" %>
      <%@ page import="service.EmployeeService" %>
   <%@ page import="java.util.*" %>
 
<%

ArrayList<Employee> list=EmployeeDao.viewAllEmployees();

%> 

<table border="1" width="90%">
<tr><th>EmployeeId</th><th>EmployeeName</th><th>EmployeeSalary</th><th>EmployeeAddress</th></tr>

 <%
 
for(Employee e: list)
{
	
 %>
	 
	 <tr><td><%=e.getEid() %></td><td><%=e.getEname() %></td><td><%=e.getEsal() %></td><td><%=e.getEaddr() %></td></tr>
 
 <%
 }
%>

 </table>